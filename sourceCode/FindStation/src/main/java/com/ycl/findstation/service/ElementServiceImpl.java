package com.ycl.findstation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycl.findstation.domain.Element;
import com.ycl.findstation.repository.ElementRepository;

/**
 * The implementation class of the element Service
 */
@Service
public class ElementServiceImpl implements ElementService {

	@Autowired
	private ElementRepository elementRepository;
	

    /**
     * The method implementation to find an element by station id and date string
     */
	@Override
    public List<Element> getElementByStationidAndDatestring(String stationId, String date) {
        List<Element> allElements = elementRepository.findAll();
        
        List<Element> result = new ArrayList<>();
        for(Element ele: allElements) {
            if (ele.getDatestring().trim().equals(date) && ele.getStationid().trim().equals(stationId)) {
                result.add(ele);
            }
        }
        return result;
    }
	
    /**
     * the method implementation to find an element by station id
     */
    @Override
    public List<Element> getElementByStationid(String stationId) {
        List<Element> allElements = elementRepository.findAll();
        
        List<Element> result = new ArrayList<>();
        for(Element ele: allElements) {
            if (ele.getStationid().trim().equals(stationId)) {
                result.add(ele);
            }
        }
        return result;
    }

}
