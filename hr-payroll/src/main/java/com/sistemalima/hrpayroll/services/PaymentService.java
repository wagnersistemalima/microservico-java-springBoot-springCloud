package com.sistemalima.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.sistemalima.hrpayroll.entities.Payment;

// camada de serviço / regras de negocios

@Service
public class PaymentService {
	
	// metodo para retornar um pagamento
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
