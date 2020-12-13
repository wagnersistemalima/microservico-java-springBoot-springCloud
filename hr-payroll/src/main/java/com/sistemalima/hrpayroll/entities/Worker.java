package com.sistemalima.hrpayroll.entities;

import java.io.Serializable;

//não é uma entidade persistente do banco de dados

//projeto Payroll não tem JPA

// Precisaremos só da estrutura


public class Worker implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// atributos basicos
	
	
	private Long id;
	
	private String name;
	private double dailyIncome;
	
	// construtor padrao
	
	public Worker() {
		
	}
	
	// construtor com argumento
	public Worker(Long id, String name, double dailyIncome) {
		
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}
	
	// Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
	// HashCode & equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
