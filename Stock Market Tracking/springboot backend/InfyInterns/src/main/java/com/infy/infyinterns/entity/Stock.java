package com.infy.infyinterns.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock
{

	@Id
	private String name;
	private Double open;
	private Double low;
	private Double high;
	private Double close;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	public Double getLow() {
		return low;
	}
	public void setLow(Double low) {
		this.low = low;
	}
	public Double getOpen() {
		return open;
	}
	public void setOpen(Double open) {
		this.open = open;
	}
	public Double getClose() {
		return close;
	}
	public void setClose(Double close) {
		this.close = close;
	}
	
	

}
