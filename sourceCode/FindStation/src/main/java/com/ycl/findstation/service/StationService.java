package com.ycl.findstation.service;

import com.ycl.findstation.domain.Station;

/**
 * station service interface
 *
 * @author Yinchen Li
 */
public interface StationService {

    /**
     * find the Station by id
     * @param String id 
     * @return
     */
    Station findById(String id);
}