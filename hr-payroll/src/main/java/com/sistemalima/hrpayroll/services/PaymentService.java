package com.sistemalima.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemalima.hrpayroll.entities.Payment;
import com.sistemalima.hrpayroll.entities.Worker;
import com.sistemalima.hrpayroll.feignClients.WorkerFeignClient;

// camada de serviço / regras de negocios

@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	
	// metodo para retornar um pagamento de um trabalhador especifico, fazendo a requisição para o outro projeto worker
	
	public Payment getPayment(Long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
