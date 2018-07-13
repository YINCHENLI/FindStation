package com.ycl.findstation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ycl.findstation.repository.ElementRepository;
import com.ycl.findstation.service.StationService;

/**
 * Main page controller
 * author: yinchen li
 */
@Controller
public class MainController {
	
	@Autowired
	private StationService stationService;
	
	@Autowired
	private ElementRepository elementService;
	
	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}

}
