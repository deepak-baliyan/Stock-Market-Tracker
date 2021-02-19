package com.infy.infyinterns.service;



import com.infy.infyinterns.dto.StockDTO;

import com.infy.infyinterns.exception.InfyInternException;

public interface StockService {

	public Double allocateStock(StockDTO s) throws InfyInternException;

	
	
	
}
