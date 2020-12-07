package com.sistemalima.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sistemalima.hrpayroll.entities.Payment;
import com.sistemalima.hrpayroll.entities.Worker;

// camada de serviço / regras de negocios

@Service
public class PaymentService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	// metodo para retornar um pagamento de um trabalhador especifico, fazendo a requisição para o outro projeto worker
	
	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", "" + workerId);
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
