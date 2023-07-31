package com.garra.crudclient.dto;

import java.time.LocalDate;

import com.garra.crudclient.entities.Cliente;

public class ClienteDTO {

	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private LocalDate birthDate;

	public ClienteDTO() {
	}

	public ClienteDTO(Long id, String name, String cpf, Double income, LocalDate birthDate) {

		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
	}
	
	public ClienteDTO(Cliente cliente) {

		id = cliente.getId();
		name = cliente.getName();
		cpf = cliente.getCpf();
		income = cliente.getIncome();
		birthDate = cliente.getBirthDate();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

}
