package com.sistemalima.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// classe de configuração / componente Rest template

@Configuration
public class AppConfig {
	
	// metodo para registrar uma instancia unica que vai ficar disponivel para injetar em outros componentes
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	// padrao de projeto Singleton, instancia unica

}
