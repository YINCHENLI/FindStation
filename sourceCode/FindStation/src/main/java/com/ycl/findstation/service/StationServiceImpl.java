package com.ycl.findstation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycl.findstation.domain.Station;
import com.ycl.findstation.repository.StationRepository;

/**
 * The implementation of Station service
 */
@Service
public class StationServiceImpl implements StationService {

	@Autowired
	private StationRepository stationRepository;

    @Override
    public Station findById(String id) {
        return stationRepository.findOne(id);

    }
}
