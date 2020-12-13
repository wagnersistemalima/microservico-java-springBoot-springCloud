package com.sistemalima.hrpayroll.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sistemalima.hrpayroll.entities.Worker;



// componente gerenciado pelo Spring

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
	
	// assinatura do metodo findById do projeto WorkerResource
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id);

}
