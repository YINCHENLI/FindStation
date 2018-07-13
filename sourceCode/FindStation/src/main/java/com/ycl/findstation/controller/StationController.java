package com.ycl.findstation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ycl.findstation.domain.Element;
import com.ycl.findstation.domain.Station;
import com.ycl.findstation.service.ElementService;
import com.ycl.findstation.service.StationService;

@RestController
@RequestMapping("/stations")
public class StationController {
    
    @Autowired
    private StationService stationService;
    
    @Autowired
    private ElementService elementService;

    /**
     * get method to Look for station id and date
     * @param station id - not null
     * @param date - could be null
     * @return
     */
    @GetMapping
    @Transactional
    public ModelAndView findStationWeather(@RequestParam(required=true, name="stationId") String stationId, 
            @RequestParam(required=false, name="date") String date, Model model) {

         //if station id is not given or wrong, return to index page
         if (stationId == null || stationId.trim().length() == 0 || stationId.length() != 11) {
            return new ModelAndView("/index", null, model);
         }
         //get the station id using station service
         Station station = stationService.findById(stationId.trim());
         
         //create an new elementList 
         List<Element> elementsList = new ArrayList<>();

         //if the user doesn't provide the date
         if (date == null || date.trim().length() == 0 || date.trim().length() != 8) {
            //get the list by searching for station id
            elementsList = elementService.getElementByStationid(stationId);
            
            model.addAttribute("station", station);
            model.addAttribute("elementsList", elementsList);
            return new ModelAndView("stations", "model", model);
         }
         //get the record that matches station id and date
         elementsList = elementService.getElementByStationidAndDatestring(stationId, date);

         model.addAttribute("station",station);
         model.addAttribute("elementsList", elementsList);
         
         //map to the stations.html
         return new ModelAndView("stations", "model", model);
      }

}
