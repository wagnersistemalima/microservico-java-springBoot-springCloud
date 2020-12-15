package com.sistemalima.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sistemalima.hrpayroll.entities.Payment;
import com.sistemalima.hrpayroll.services.PaymentService;

// controlodor Rest

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
	
	// injetar uma dependencia para a camada de serviço
	
	@Autowired
	private PaymentService service;
	
	// 1º end point / buscar pagamento por id
	
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok().body(payment);
	}
	
	// metodo alternativo
	
	public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer days) {
		Payment payment = new Payment("Brann", 400.0, days);
		return ResponseEntity.ok().body(payment);
	}
	

}
