package logmodel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		
		String user = request.getParameter("username");
		System.out.println(user);
		String pass = request.getParameter("password");
		
		DaoHelper de = new DaoHelper();
		boolean s;
		try {
			s = de.log(user, pass);
	
			if(s == true)
			{
				System.out.println("success login");
				response.sendRedirect("HomePage.jsp");
			
				HttpSession session = request.getSession();
				session.setAttribute("uname", user);
				//out.print("success");
			}
			else {
				out.print("Sometime Technical error....!");
				out.print("<br>");
				out.print("Try Again");
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
				//out.print("failed");
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
