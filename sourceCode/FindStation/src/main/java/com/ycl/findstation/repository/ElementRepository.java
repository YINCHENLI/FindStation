package com.ycl.findstation.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ycl.findstation.domain.Element;
import com.ycl.findstation.domain.Station;

/**
 * Element Repository
 *
 */
public interface ElementRepository extends JpaRepository<Element, Long>{
    /**
     * find all the elements that matches stationId and date
     * @param stationId
     * @param date
     * @return
     */
    List<Element> getElementByStationidAndDatestring(String stationId, String date);

}
