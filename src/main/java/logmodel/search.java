package logmodel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.NodeList;

import beanpojo.user;

//import com.sun.corba.se.impl.orbutil.graph.Node;
//import com.sun.xml.internal.txw2.Document;

/**
 * Servlet implementation class search
 */
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
	    try
        {
            PrintWriter out=response.getWriter();
            String pk = request.getParameter("pk");
            String fname=request.getParameter("fname");
            String lname=request.getParameter("lastName");
            
            
            
            String mobile=request.getParameter("Mobileno");
            String username=request.getParameter("username");
            String pass = request.getParameter("password");
            String cpass = request.getParameter("cpassword");
            
            session.setAttribute("fname", fname);
            System.out.println("@@"+mobile);
           /* String pass=request.getParameter("pass");
            String cpass=request.getParameter("cpass");*/
            
            DaoHelper d = new DaoHelper();
           
            HashMap<Integer, List<String>> datamap = d.getDataFromTable(pk, fname, lname, mobile, username, pass, cpass);
            
            
          //  Datahelper d=new Datahelper();
        //    HashMap<Integer, List<String>> dataMap = d.getDataFromTable(fname,lname,username,mobile,pass,cpass);
            
            
           /* String responsehtml = createhtml(datamap);
            if(responsehtml!=null && !responsehtml.isEmpty())
            	out.print(responsehtml);
            else
            	out.print("Error");*/
            
        
            
         String responsehtml = createXML(datamap);
            if(responsehtml!=null && !responsehtml.isEmpty())
            	out.print(responsehtml);
            else
            	out.print("Error");
            
     
            
           /* String responsehtml = createXMLDOM(datamap);
            if(responsehtml!=null && !responsehtml.isEmpty())
            	out.print(responsehtml);
            else
            	out.print("Error");
            */
            
            
            
        //    String responseXml = createXml(dataMap);
         //   String responseXml1 = createhtml(dataMap);
         //   if(responseXml!=null && !responseXml.isEmpty())
         //       out.print(responseXml);
         //   else

          //      out.print("Error");

        }
    catch(Exception e){
        e.printStackTrace();
    }

	}
	
	private String createhtml(HashMap<Integer, List<String>> datamap){
		
		
		try {
			StringBuffer str = new StringBuffer();
			str.append("<table border='1s' cellpadding='30px' align='center' bordercolor='red'>");
			str.append("<thead><tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th></tr></thead>");
			str.append("<tbody>"); 
			System.out.println("success");
			for(Entry<Integer, List<String>> entry : datamap.entrySet())
			{
				str.append("<tr>");
				List<String> dataList = entry.getValue();
				for(int i=0;i<dataList.size();i++)
				{
					str.append("<td>" + dataList.get(i) + "</td>");
					
				}
				
				str.append("</tr>"); 
				
				str.append("</tbody>");
	            str.append("</table>");
	            return str.toString(); 
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	private String createXML(HashMap<Integer, List<String>> datamap)
	{
		
		try {
			StringBuffer str = new StringBuffer();
			/*str.append("<table border='1s' cellpadding='30px' align='center' bordercolor='red'>");
			str.append("<thead><tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Mobile </th><th>Password</th><th>Confirm Password</th></tr></thead>");
			str.append("<tbody>"); */
			str.append("<xml>");
			
			for(Entry<Integer, List<String>> entry : datamap.entrySet())
			{
				/*str.append("<tr>");*/
			str.append("<user>");
			
				List<String> dataList = entry.getValue();
				for(int i=0;i<dataList.size();i++)
				{
					int abc = 0;
					//str.append("<td>" + dataList.get(i) + "</td>");
					str.append("<id>" + dataList.get(abc++) + "</id>");
					str.append("<fname>" + dataList.get(abc++) + "</fname>");
					str.append("<lname>" + dataList.get(abc++) + "</lname>");
					str.append("<mobile>" + dataList.get(abc++) + "</mobile>");
					str.append("<username>" + dataList.get(abc++) + "</username>");
					str.append("<password>" + dataList.get(abc++) +"</password>");
					str.append("<cpassword>" + dataList.get(abc++) + "</cpassword>");
					
					
					
				}
				str.append("</user>");
				
				 
			}
			str.append("</xml>");
            return str.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	
	
	
	private String createXMLDOM(HashMap<Integer, List<String>> datamap) throws Exception{
		
		StringBuffer str = new StringBuffer();
	
		try {
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
			org.w3c.dom.Document doc = dBuilder.newDocument();
			org.w3c.dom.Element rootElement = doc.createElement("xml");
			doc.appendChild(rootElement);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element "+ doc.getDocumentElement().getNodeName());
			
			org.w3c.dom.Element use = doc.createElement("user");
			rootElement.appendChild(use);
			String output = null;
			for(Entry<Integer, List<String>> entry : datamap.entrySet())
			{
			
			
			
			
		/*	Attr attr = doc.createAttribute("id");
			attr.setValue("10");
			use.setAttributeNode(attr);
			*/
			
			
			
			List<String> dataList = entry.getValue();
			
			for(int i=0;i<dataList.size();i++)
			{
				int abc = 0 ;
 				org.w3c.dom.Element fname = doc.createElement("fname");
				fname.appendChild(doc.createTextNode(dataList.get(abc++)));
				use.appendChild(fname);
				
				org.w3c.dom.Element lname = doc.createElement("lname");
				lname.appendChild(doc.createTextNode(dataList.get(abc++)));
				use.appendChild(lname);
				
				org.w3c.dom.Element mobile = doc.createElement("mobile");
				mobile.appendChild(doc.createTextNode(dataList.get(abc++)));
				use.appendChild(mobile);
				
				org.w3c.dom.Element username = doc.createElement("username");
				username.appendChild(doc.createTextNode(dataList.get(abc++)));
				use.appendChild(username);
				
				org.w3c.dom.Element password = doc.createElement("password");
				password.appendChild(doc.createTextNode(dataList.get(abc++)));
				use.appendChild(password);
				
				org.w3c.dom.Element cpassword = doc.createElement("cpassword");
				cpassword.appendChild(doc.createTextNode(dataList.get(abc++)));
				use.appendChild(cpassword);
				
			
			}
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer;
			
			 
			StringWriter write = new StringWriter();
			transformer = transformerFactory.newTransformer();
			transformer.transform(new DOMSource(doc), new StreamResult(write));
			
			output= write.getBuffer().toString();
			
			
			
			
			
			// DOMSource source = new DOMSource();
			 //StreamResult result = new StreamResult(new File("C:\\cars.xml"));
		//	 ((Transformer) transformer).transform(source, result);
			 
			 
			// ((Transformer) transformer).transform(source, consoleResult);
			}
			
			
			 
			
			return output.toString();
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
		
	}
	
/*	private String DEMOcreateXMLDOM(HashMap<Integer, List<String>> datamap) throws Exception{
		try
		{
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
		org.w3c.dom.Document doc = dBuilder.newDocument();
		org.w3c.dom.Element rootElement = doc.createElement("xml");
		doc.appendChild(rootElement);
		doc.getDocumentElement().normalize();
		
		System.out.println("Root element "+ doc.getDocumentElement().getNodeName());
		
		for(Entry<Integer, List<String>> entry : datamap.entrySet())
		{
		
		NodeList nList = doc.getElementsByTagName("string");
		List<String> dataList = entry.getValue();
	    for (int temp = 0; temp < ((NodeList) dataList).getLength(); temp++) {

	        Node nNode = (Node) nList.item(temp);

	        System.out.println("\nCurrent Element :" + ((org.w3c.dom.Node) nNode).getNodeName());

	       
	    }
		}
		}
		catch(Exception e){
			
		}
		
		return null;
		
		
		
		
	}
	*/
	
	

}
