package logmodel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.register;

//import com.sun.java.swing.plaf.windows.resources.windows;


public class registraction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public registraction() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pk = request.getParameter("pk");
		String fname = request.getParameter("Firstname");
		String lname = request.getParameter("lastName");
		//int mobile = Integer.parseInt(request.getParameter("Mobileno"));
		String mobile = request.getParameter("Mobileno");
		//Long mob = Long.parseLong(mobile);
	//	Double mob = Double.parseDouble(mobile);
		
		String uname =request.getParameter("username");
		System.out.println("chech user" + uname);
		String password = request.getParameter("password");
		System.out.println("check pass" + password);
		String cpass= request.getParameter("cpassword");
		
	
		
		DaoHelper de = new DaoHelper();
		boolean s;
		
//		try {
//			s = de.save(fname, lname, mobile, uname, password, cpass);
//			if(s == true)
//			{
//				System.out.println("success");
//				response.sendRedirect("Login.jsp");
//				
//				
//			}
//			else
//			{
//				System.out.println("ERROR");
//				System.out.println("error1");
//				out.print("Technical Problem...!");
//				out.print("<br>");
//				out.print("Try Again");
//				RequestDispatcher rd = request.getRequestDispatcher("Registraction.jsp");
//				rd.include(request, response);
//				
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		register re = new register();
		re.setUsername(uname);
		re.setFirstname(fname);
		re.setLastName(lname);
		re.setMobileno(mobile);
		re.setPassword(password);
		re.setCpassword(cpass);
		
		int i = DaoHelper.save(re);
		if(i>0)
		{
			System.out.println("success");
			response.sendRedirect("success.jsp");
		}
		else
		{
			System.out.println("error");
			response.sendRedirect("error.jsp");
		}
		//***************************************************************************************************
//		register r = null;
//		int i = DaoHelper.save(r);
//		
//		if(i>0)
//		{
//			System.out.println("success");
//			response.sendRedirect("success.jsp");
//		}
//		else {
//			System.out.println("error");
//			response.sendRedirect("error.jsp");
//		}
				
		
		
	}

}
