package hotel.bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.cache.CacheException;

import logmodel.DaoHelper;

/**
 * Servlet implementation class createhotel
 */
public class createhotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createhotel() {
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
		HttpSession session = request.getSession();
		
		try {
			

		String hotelid = request.getParameter("hotelid");
		String hotelname = request.getParameter("hotelname");
		String city = request.getParameter("city");
		String room = request.getParameter("room");
		String price = request.getParameter("price");
		
		String datepicker = request.getParameter("datepicker");
		String datepicker1 = request.getParameter("datepicker1");
		
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date CheckIN = null;
		Date CheckOUT = null;
		try {
			CheckIN = (Date) sdf.parse(request.getParameter("CheckIN"));
			CheckOUT = (Date) sdf.parse(request.getParameter("CheckOUT"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	
	
		
		
		session.setAttribute("hotelname", hotelname);
		session.setAttribute("city", city);
		session.setAttribute("room", room);
		session.setAttribute("price", price);
		System.out.println("hotel name " + hotelname);
		System.out.println("City name " + city);
		
		DaoHelper d = new DaoHelper();
		
		boolean s;
		
	
		
		try {
			
			s = d.HotelRegistraction(hotelname, city, datepicker, datepicker1, room, price);
		
		if(s)
		{
			System.out.println("HOtel ReGIstraction SuCCseeful;");
			out.print("success");
			System.out.println("successful");
			
		}
		else
		{
			System.out.println("SoRRY TeCHniCAl ISSue !....");
			out.print("Error");
			
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		}
		catch(CacheException h){
			h.printStackTrace();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
