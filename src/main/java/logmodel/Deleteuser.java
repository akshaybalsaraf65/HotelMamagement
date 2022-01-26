package logmodel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deleteuser
 */
public class Deleteuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deleteuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		
		String pk = request.getParameter("pk");
		String Firstname=request.getParameter("Firstname");
        String lastName=request.getParameter("lastName");
        
        
        
        String Mobileno=request.getParameter("Mobileno");
        String username=request.getParameter("username");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
		
		/* String username=request.getParameter("username");
		 String Mobileno=request.getParameter("Mobileno");
         */
         
         DaoHelper d = new DaoHelper();
         
         boolean s;
         try {
			s = d.getDataDEleteTable(pk);
			
			if( s == true)
			{
				out.print("success");
				
			}
			else
			{
				out.print("Error");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
       // Object ob = d.getDataDEleteTable(username, Mobileno);
        
       /* String responsexml = createdeleteXML(ob);
        if(responsexml!= null && !responsexml.isEmpty())
        	out.print(responsexml);
        else
        	out.print("Error");*/
		
	}
	
	
	private String createdeleteXML(Object ob){
		
		
		
		
		return null;
		
	}

}
