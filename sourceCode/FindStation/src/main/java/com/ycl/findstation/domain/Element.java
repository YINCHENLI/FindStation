package com.ycl.findstation.domain;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.ycl.findstation.util.WeatherElementHelper;
/**
 * Element entity
 * @author yinchenli
 */
@Entity
public class Element {
    private static final long serialVersionUID = 1L;

    @Id

    @Column(name="id")
    private Long id;
   
    @Column(name="stationid")
    private String stationid;
    
    @Column(name="datestring")
    private String datestring;
    
    @Column(name="attribute")
    private String attribute;
    
    @Column(name="value")
    private String value;
    
    public Element () {}

    public Element(Long id, String stationid, String datestring, String attribute, String value) {
        super();
        this.id = id;
        this.stationid = stationid;
        this.datestring = datestring;
        this.attribute = attribute;
        this.value = value;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getDatestring() {
        return datestring;
    }

    public void setDatestring(String datestring) {
        this.datestring = datestring;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * get the name of the attribute using the weather element map
     * @param attribute
     * @return
     */
    public String getAttributeName(String attribute){
        WeatherElementHelper hp = new WeatherElementHelper();
        Map<String, String> map = hp.getMap();
        if (!map.containsKey(attribute)){
            return "";
        }
        return map.get(attribute);
        
    }

}
