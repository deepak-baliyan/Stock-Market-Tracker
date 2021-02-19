package com.infy.infyinterns.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.infyinterns.entity.Stock;

public interface StockRepository extends CrudRepository<Stock,String>
{
    // add methods if required
}
