package com.infy.infyinterns.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.infy.infyinterns.dto.StockDTO;


import com.infy.infyinterns.service.StockService;

@CrossOrigin
@RestController
@RequestMapping("Stock")
public class StockAllocationAPI {

	@Autowired
	private StockService stService;

	@Autowired
	private Environment environment;

	@RequestMapping(value = "/enter", method = RequestMethod.POST)
	public ResponseEntity<String> authenticateUser(@RequestBody StockDTO st) {

		try {
			Double d = stService.allocateStock(st);
			String successMessage = environment.getProperty("UserAPI.REGISTER_USER_SUCCESS1") + d;
			return new ResponseEntity<String>(successMessage, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.OK, environment.getProperty(e.getMessage()));
		}
	}

	

}
