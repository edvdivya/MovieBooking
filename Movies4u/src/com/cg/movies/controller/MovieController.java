package com.cg.movies.controller;

import com.cg.movies.dto.*;


import com.cg.movies.exception.UserException;
import com.cg.movies.service.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MovieController {

	@Autowired
	TheatreService theatreservice;
	@Autowired
	ShowService showservice;
	@Autowired
	MovieService movieservice;
	@Autowired
	AdminService adminservice;
	@Autowired
	CustomerService customerservice;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}

	@RequestMapping(value = "/addBooking_page", method = RequestMethod.GET)
	public String addBooking(@ModelAttribute("booking_details") Booking booking, Map<String, Object> model) {
		List<String> types = new ArrayList<String>();
		types.add("Select");
		types.add("Elec");
		types.add("Grocery");
		types.add("Clothing");
		model.put("dataitem", types);
		List<String> typesradio=new ArrayList<String>();
		typesradio.add("Online");
		typesradio.add("Offline");
		model.put("radiodataitem", typesradio);
		
		List<String> typescheckboxes=new ArrayList<String>();
		typescheckboxes.add("alpha");
		typescheckboxes.add("Beta");
		typescheckboxes.add("gama");
		model.put("featuresdataitem", typescheckboxes);
		
		
		return "addProduct";
	}

}