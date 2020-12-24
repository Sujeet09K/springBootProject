package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("lap1")
//Component annotation will notify the framework that this class will act as component in the project
//The object of this class will be named as lap1
public class Laptop {
	public static final Logger log = LoggerFactory.getLogger(Laptop.class);
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		log.info("Laptop compiling");
	}

}
