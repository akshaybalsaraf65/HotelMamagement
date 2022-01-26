package pojo;

import java.util.HashSet;
import java.util.Set;

public class city {

	private int cityid;
	private String cityname;
	Set<hotel> hotel = new HashSet<>();
	
	
	
	
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public Set<hotel> getHotel() {
		return hotel;
	}
	public void setHotel(Set<hotel> hotel) {
		this.hotel = hotel;
	}
	public city() {
		super();
	}
	public city(int cityid, String cityname, Set<pojo.hotel> hotel) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.hotel = hotel;
	}
	
	
}
