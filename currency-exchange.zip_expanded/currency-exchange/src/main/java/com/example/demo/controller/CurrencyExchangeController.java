package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ExchangeRateDTO;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment environment;
	
	@GetMapping("/exchange-rate/{fromCurrency}/{toCurrency}")
	public ExchangeRateDTO getExchangeRate(@PathVariable String fromCurrency,@PathVariable String toCurrency) {
		String port = environment.getProperty("local.server.port");
		return new ExchangeRateDTO(fromCurrency, toCurrency, BigDecimal.valueOf(81.5),port);
	}

}
