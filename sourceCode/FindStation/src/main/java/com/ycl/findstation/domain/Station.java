package com.ycl.findstation.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Station entity
 * 
 * @author Yinchen Li
 */
@Entity
public class Station {
	
	@Id // main key
	private String id; // the unique id of the station

    private String latitude;
    
    private String longitude;
    
    private String elevation;
    
    private String state;
    
    private String name;
    
    private String gsn;
    
    private String others;
    
    public Station(){}

	public Station(String id, String latitude, String longitude, String elevation, String state, String name, String gsn, String others) {
        super();
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.state = state;
        this.name = name;
        this.gsn = gsn;
        this.others = others;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getGsn() {
        return gsn;
    }
    
    public void setGsn(String gsn){
        this.gsn = gsn;
    }
    
    public String getOthers() {
        return others;
    }
    
    public void setOthers(String others){
        this.others = others;
    }

    @Override
    public String toString() {
        return "Station [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", state=" + state
                + ", name=" + name + "]";
    }
    

}
