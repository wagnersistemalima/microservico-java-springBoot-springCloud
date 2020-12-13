package com.sistemalima.hrworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemalima.hrworker.entities.Worker;
import com.sistemalima.hrworker.repositories.WorkerRepository;

// controlador Rest

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;
	
	
	
	@Autowired
	private WorkerRepository repository;
	
	// 1º end point /buscar todos os trabalhadores / retorna uma resposta 200
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// 2º end point / buscar trabalhador pelo id / retorna uma resposta 200
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok().body(obj);
		
	}

}
