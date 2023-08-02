package com.garra.crudclient.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.garra.crudclient.dto.ClienteDTO;
import com.garra.crudclient.services.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/clients")
public class ClienteController {
	
	@Autowired
	private ClienteService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<ClienteDTO> findById(@PathVariable Long id) {

		ClienteDTO dto = service.findById(id);
		return ResponseEntity.ok(dto);

	}

	@GetMapping
	public ResponseEntity<Page<ClienteDTO>> findAll(Pageable pageable) {
		Page<ClienteDTO> dto = service.findAll(pageable);
		return ResponseEntity.ok(dto);
	}

	@PostMapping
	public ResponseEntity<ClienteDTO> insert(@Valid @RequestBody ClienteDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ClienteDTO> update(@PathVariable Long id,@Valid  @RequestBody ClienteDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
