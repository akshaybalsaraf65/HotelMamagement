package Bean.Pojo;



public class hotelsearch {

	private String hotelid,hotelname,starrate,roomtype,price;
	private citysearch city;
	
	
	

	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getStarrate() {
		return starrate;
	}

	public void setStarrate(String starrate) {
		this.starrate = starrate;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	

	public hotelsearch() {
		super();
	}

	public citysearch getCity() {
		return city;
	}

	public void setCity(citysearch city) {
		this.city = city;
	}

	public hotelsearch(String hotelid, String hotelname, String starrate,
			String roomtype, String price, citysearch city) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		this.starrate = starrate;
		this.roomtype = roomtype;
		this.price = price;
		this.city = city;
	}
	
	
	
	
	
}
