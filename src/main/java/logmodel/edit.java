package logmodel;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Servlet implementation class edit
 */
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		
		try {
			String pk = request.getParameter("pk");
			String Firstname=request.getParameter("Firstname");
            String lastName=request.getParameter("lastName");
            
            
            
            String Mobileno=request.getParameter("Mobileno");
            String username=request.getParameter("username");
            String password = request.getParameter("password");
            String cpassword = request.getParameter("cpassword");
            
            DaoHelper d = new DaoHelper();
            boolean s;
            try {
				s = d.getDataFromEditTable(pk,Firstname, lastName, Mobileno, username, password, cpassword);
				
				if(s == true){
					out.print("success");
					System.out.println("successful");
				}
				else
				{
					out.print("Error");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
           
        //   int ab  = d.getDataFromEditTable(Firstname, lastName, Mobileno, username, password, cpassword);
           
            
            /*if(ab == 4){
            	out.print("success");
            }
            else
            {
            	System.out.println();
            	out.print("Error");
            }*/
        /*   String responseXML = createeditXML(ab);
           if(responseXML!=null && !responseXML.isEmpty())
        	   out.print(responseXML);
           else
        	   out.print("Error");*/
            
            
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	private String createeditXML(Object ab)
	{
		
		
		try {
			StringBuffer str = new StringBuffer();
			str.append("<xml>");
			
			str.append("<user>");
			
			
			
			str.append("<fname></fname>");
			str.append("<lname></lname>");
			str.append("<mobile></mobile>");
			str.append("<username></username>");
			str.append("<password></password>");
			str.append("<cpassword></cpassword>");
			
			str.append("</user>");
			
			str.append("</xml>");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	/*private String createXMLDOM(List datamap) throws Exception{
		
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
			
			
			
			
			Attr attr = doc.createAttribute("id");
			attr.setValue("10");
			use.setAttributeNode(attr);
			
			
			
			
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
	*/

}
