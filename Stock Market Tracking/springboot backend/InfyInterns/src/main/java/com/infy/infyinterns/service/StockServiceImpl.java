package com.infy.infyinterns.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.infyinterns.dto.StockDTO;
import com.infy.infyinterns.entity.Stock;
import com.infy.infyinterns.exception.InfyInternException;
import com.infy.infyinterns.repository.StockRepository;
@Service(value = "StService")
@Transactional
public class StockServiceImpl implements StockService {
	@Autowired
	private StockRepository stockRepository;

	@Override
	public Double allocateStock(StockDTO s) throws InfyInternException {
		Optional<Stock> opt=stockRepository.findById(s.getName());
		if(!opt.isEmpty()) {
			Stock st=opt.get();
			stockRepository.delete(st);
		}

		Stock sto= new Stock();
		sto.setClose(s.getClose());
		sto.setHigh(s.getHigh());
		sto.setLow(s.getLow());
		sto.setOpen(s.getOpen());
		stockRepository.save(sto);
		
		return s.getClose();
	}

	
	


	
	
}