package hotel.bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javassist.convert.Transformer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import pojo.city;
import pojo.hotel;
import logmodel.DaoHelper;

/**
 * Servlet implementation class searchroom
 */
public class searchroom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchroom() {
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
		//String id = request.getParameter("id");
			/*String Hid = request.getParameter("Hid");
			String HName = request.getParameter("HName");
			String CID = request.getParameter("CID");
			String StarRate = request.getParameter("StarRate");*/
		/*	String RoomType = request.getParameter("RoomType");
			String Price = request.getParameter("Price");
			
			String CNAME = request.getParameter("CNAME");*/
			
		String hotel = request.getParameter("hotel");
		//String hotelname = request.getParameter("hotelname");
		
		String datepicker = request.getParameter("datepicker");
		String checkOut = request.getParameter("checkOut");
		String room = request.getParameter("room");
		String adults = request.getParameter("adults");
		String children = request.getParameter("children");
		//String citypincode = request.getParameter("citypincode");
		
		session.setAttribute("adults", adults);
		session.setAttribute("children", children);
		session.setAttribute("hotel", hotel);
		System.out.println("Ajax through hotel name "+hotel);
		
		DaoHelper d = new DaoHelper();
		HashMap<Integer, Map<city, List<pojo.hotel>>> dataList=  (HashMap<Integer, Map<city, List<pojo.hotel>>>) d.getDataFromHotelSearch(hotel);
		Map<city, List<pojo.hotel>> map = dataList.get(0);
		session.setAttribute("hotelname", map);
		
		String responseXML = createXML(dataList);
		if(responseXML!=null && !responseXML.isEmpty())
			out.print(responseXML);
		else
			out.print("Error");
	}
	
	
	
	
	
	
	private String createXML(HashMap<Integer, Map<city, List<hotel>>> dataMap) {

        try {

              DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
                org.w3c.dom.Document doc = dBuilder.newDocument();
                org.w3c.dom.Element rootElement = doc.createElement("xml");
                doc.appendChild(rootElement);
            for (Entry<Integer, Map<city, List<hotel>>> entry : dataMap.entrySet())
            {
                Map<city, List<hotel>> value = entry.getValue();
                Set<Entry<city, List<hotel>>> entrySet = value.entrySet();

                for (Entry<city, List<hotel>> flightData : entrySet)
                {
                    city key = flightData.getKey();
                    List<hotel> fareList = flightData.getValue();

                    for (int i = 0; i < fareList.size(); i++)
                    {
                        hotel fare = fareList.get(i);
                        org.w3c.dom.Element hotel = doc.createElement("hotel");
                        rootElement.appendChild(hotel);
                        hotel.setAttribute("Id", String.valueOf(key.getCityid()));
                        hotel.setAttribute("cityname", key.getCityname());
                        
                       
                        hotel.setAttribute("hotelname", fare.getHotelname());
                        //hotel.setAttribute("price", fare.getPrice());
                       /* hotel.setAttribute("hotelname", fare.getPrice());*/

                    }


                }


            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer;


            StringWriter write = new StringWriter();
            transformer = transformerFactory.newTransformer();
            transformer.transform(new DOMSource(doc), new StreamResult(write));
            String string = write.getBuffer().toString();
            return  string.toString();
           // System.out.println();
            /*


            StringBuffer str = new StringBuffer();
            str.append("<xml>");

            for (Entry<Integer, Map<flightsearch, List<fare>>> entry : dataMap.entrySet()) {
                str.append("<flight>");
                Map<flightsearch, List<fare>> dataList = entry.getValue();

                for (Entry<flightsearch, List<fare>> entry1 : dataList.entrySet()) {
                    str.append("<" + entry1.getKey() + ">" + entry1.getValue()
                            + "</" + entry1.getKey() + ">");
                }
                str.append("</flight>");
            }
            str.append("</xml>");
            return str.toString();
        */} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return null;

    }

	
}	
	
	/*private String createXML(ArrayList<String> dataList){
		
			StringBuffer str = new StringBuffer();
			try {
				if(!dataList.isEmpty() && dataList.size()>0)
				{
					str.append("<xml>");
					str.append("<hotels>");
					for(int i = 0 ;i<dataList.size();i++)
					{
						str.append("<hotel>");
						str.append("<hotelname>"+ dataList.get(i) +"</hotelname>");
						str.append("<cityname>"+ dataList.get(i+1) +"</cityname>");
						str.append("<roomtype>"+ dataList.get(i+2) +"</roomtype>");
						str.append("<price>"+ dataList.get(i+3) +"</price>");
						
						str.append("</hotel>");
						i=i+3;
					}
					str.append("</hotels>");
					str.append("</xml>");
				}
					return str.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("ERROR");
		}
		return null;
	}

}*/


