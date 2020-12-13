package com.sistemalima.hrpayroll.entities;

import java.io.Serializable;

// não é uma entidade persistente do banco de dados

// projeto Payroll não tem JPA

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// atributos basicos 
	
	private String name;
	private double dailyIncome;
	private Integer days;
	
	// construtor padrão
	
	public Payment() {
		
	}
	
	// construtor com argumentos

	public Payment(String name, double dailyIncome, Integer days) {
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}
	
	// Getters & setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	
	// metodo total
	
	public Double getTotal() {
		return days * dailyIncome;
	}
	

}
