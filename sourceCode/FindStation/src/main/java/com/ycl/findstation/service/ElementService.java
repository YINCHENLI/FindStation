package com.ycl.findstation.service;

import java.util.List;

import com.ycl.findstation.domain.Element;
/**
 * Element service interface
 */
public interface ElementService {
    
    /**
     * get the element by station id and date
     * @param stationId
     * @param date
     * @return
     */
    List<Element> getElementByStationidAndDatestring(String stationId, String date);
    
    /**
     * get the element by stationid
     * @param stationId
     * @return
     */
    List<Element> getElementByStationid(String stationId);

}