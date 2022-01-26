package pojo;

public class room {

	private int roomid;
	private String roomname,price;
	private hotel hotel;

	

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public hotel getHotel() {
		return hotel;
	}

	public void setHotel(hotel hotel) {
		this.hotel = hotel;
	}

	public room() {
		super();
	}

	public room(int roomid, String roomname, String price, pojo.hotel hotel) {
		super();
		this.roomid = roomid;
		this.roomname = roomname;
		this.price = price;
		this.hotel = hotel;
	}

	
	
	
	
}
