package com.garra.crudclient.dto;

import java.time.LocalDate;

import com.garra.crudclient.entities.Cliente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public class ClienteDTO {

	private Long id;
	
	@Size(min = 3, max = 80,message = "Nome presisa ter de 3 a 80 caracteres")
	@NotBlank(message = "não pode ser vazio")
	private String name;
	private String cpf;
	private Double income;
	
	@PastOrPresent(message = "Não pode ser datas futuras")
	private LocalDate birthDate;
	private Integer children;

	public ClienteDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {

		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClienteDTO(Cliente cliente) {

		id = cliente.getId();
		name = cliente.getName();
		cpf = cliente.getCpf();
		income = cliente.getIncome();
		birthDate = cliente.getBirthDate();
		children = cliente.getChildren();
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

	public Integer getChildren() {
		return children;
	}

}
