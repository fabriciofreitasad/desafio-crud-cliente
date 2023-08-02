package com.garra.crudclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.garra.crudclient.dto.ClienteDTO;
import com.garra.crudclient.entities.Cliente;
import com.garra.crudclient.repositories.ClienteRepository;
import com.garra.crudclient.services.exceptions.DatabaseException;
import com.garra.crudclient.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id) {
		Cliente cliente = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cliente inexistente"));
		return new ClienteDTO(cliente);

	}

	@Transactional(readOnly = true)
	public Page<ClienteDTO> findAll(Pageable pageable) {
		Page<Cliente> result = repository.findAll(pageable);
		return result.map(x -> new ClienteDTO(x));
	}

	@Transactional
	public ClienteDTO insert(ClienteDTO dto) {

		Cliente entity = new Cliente();

		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new ClienteDTO(entity);
	}

	@Transactional
	public ClienteDTO update(Long id, ClienteDTO dto) {
		try {
			Cliente entity = repository.getReferenceById(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new ClienteDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("cliente inexistente");
		}

	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public void delete(Long id) {
		if (!repository.existsById(id)) {
			throw new ResourceNotFoundException("cliente inexistente");
		}
		try {
	        	repository.deleteById(id);    		
		}
	    	catch (DataIntegrityViolationException e) {
	        	throw new DatabaseException("Falha de integridade referencial");
	   	}
	}


	private void copyDtoToEntity(ClienteDTO dto, Cliente entity) {
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());

	}

}
