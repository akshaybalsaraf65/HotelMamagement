package Bean.Pojo;

import java.util.Set;

public class citysearch {

	private String cityid , cityname;
	private Set<hotelsearch> hotelsearch;

	
	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	
	
	
	
	
	
	
	
	public Set<hotelsearch> getHotelsearch() {
		return hotelsearch;
	}

	public void setHotelsearch(Set<hotelsearch> hotelsearch) {
		this.hotelsearch = hotelsearch;
	}

	public citysearch(String cityid, String cityname,
			Set<Bean.Pojo.hotelsearch> hotelsearch) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.hotelsearch = hotelsearch;
	}

	public citysearch() {
		super();
	}

	
	
	
	
}
