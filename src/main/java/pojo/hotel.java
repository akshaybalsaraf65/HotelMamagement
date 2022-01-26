package pojo;


import java.util.HashSet;
import java.util.Set;

public class hotel {

	private int hotelid;
	private String hotelname,CheckIN,CheckOUT;
	private city city;
	
	Set<room> room = new HashSet<>();
	
	
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public city getCity() {
		return city;
	}
	public void setCity(city city) {
		this.city = city;
	}
	
	

	public String getCheckIN() {
		return CheckIN;
	}
	public void setCheckIN(String checkIN) {
		CheckIN = checkIN;
	}
	public String getCheckOUT() {
		return CheckOUT;
	}
	public void setCheckOUT(String checkOUT) {
		CheckOUT = checkOUT;
	}
	public hotel() {
		super();
	}
	public hotel(int hotelid, String hotelname, pojo.city city) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		
		this.city = city;
	}
	public Set<room> getRoom() {
		return room;
	}
	public void setRoom(Set<room> room) {
		this.room = room;
	}
	public hotel(int hotelid, String hotelname,
			pojo.city city, Set<pojo.room> room) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		
		this.city = city;
		this.room = room;
	}
	
	public hotel(int hotelid, String hotelname,
			String checkIN, String checkOUT, pojo.city city, Set<pojo.room> room) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		
		CheckIN = checkIN;
		CheckOUT = checkOUT;
		this.city = city;
		this.room = room;
	}
	
	
	
	
}
