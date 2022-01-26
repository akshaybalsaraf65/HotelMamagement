package logmodel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class forget
 */
public class forget extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forget() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String uname =request.getParameter("username");
		System.out.println("chech user" + uname);
		String password = request.getParameter("password");
		System.out.println("check pass" + password);
		String cpass= request.getParameter("cpassword");
		
		
		DaoHelper de = new DaoHelper();
		boolean s;
		try {
			s = de.forget(uname, password, cpass);
			
			if(s == true)
			{
				System.out.println("Successful");
				response.sendRedirect("Login.jsp");
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("forgetpassword.jsp");
				rd.include(request, response);
				out.print("something wrong");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
