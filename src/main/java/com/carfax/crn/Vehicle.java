package com.carfax.crn;

import org.hibernate.annotations.Entity;

@Entity
public class Vehicle {
	Vin vin;
	String make;
	String model;
	Integer year;
}
