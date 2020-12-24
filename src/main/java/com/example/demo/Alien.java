package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Component annotation will notify the framework that this class will act as component in the project
@Scope(value = "prototype")
//Scope annotation will notify the the framework that the object of this class will be created as per the prototype rule
public class Alien {
	public static final Logger log = LoggerFactory.getLogger(Alien.class);
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	//Autowired annotation will notify the the framework that the object fof Laptop class will be mapped automatically to laptop variable
	@Qualifier("lap1")
	//Qualifier annotation will notify that framework that the laptop variable will be mapped to the lap1 named object
	//This works in sync with Component annotation
	private Laptop laptop;
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Alien() {
		super();
		// TODO Auto-generated constructor stub
		log.info("Alien Constructor...");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		log.info("In show...");
		laptop.compile();
	}

}
