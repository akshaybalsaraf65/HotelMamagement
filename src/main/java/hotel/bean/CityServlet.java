package hotel.bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logmodel.DaoHelper;

/**
 * Servlet implementation class CityServlet
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityServlet() {
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
		
		
		String term = request.getParameter("key");
		System.out.println("show city"+term);
		
		DaoHelper d = new DaoHelper();
		ArrayList<String> datalist = d.getDataFromHotelAutofocus(term);
		String autoresponsexml = autoresponsexml(datalist);
		if(autoresponsexml!=null && !autoresponsexml.isEmpty())
			out.print(autoresponsexml);
		else
			out.print("Error");
		
		
	}
	
	private String autoresponsexml(ArrayList<String> datalist)
	{
		StringBuffer str = new StringBuffer();
		
		str.append("<xml>");
		for(int i=0;i<datalist.size();i++)
		{
			str.append("<city>"+ datalist.get(i) +"</city>");
		}
		str.append("</xml>");
		return str.toString();
		
	}

}
