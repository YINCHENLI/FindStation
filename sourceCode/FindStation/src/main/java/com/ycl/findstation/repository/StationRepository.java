package com.ycl.findstation.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ycl.findstation.domain.Element;
import com.ycl.findstation.domain.Station;

/**
 * Station Repository.
 *
 */
public interface StationRepository extends JpaRepository<Station, String>{


    /**
     * find the station by id
     * @param id
     * @return
     */
    Station findById(String id);
}
