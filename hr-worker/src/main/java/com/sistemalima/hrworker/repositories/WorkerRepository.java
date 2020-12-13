package com.sistemalima.hrworker.repositories;

// camada de acesso a dados

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemalima.hrworker.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
