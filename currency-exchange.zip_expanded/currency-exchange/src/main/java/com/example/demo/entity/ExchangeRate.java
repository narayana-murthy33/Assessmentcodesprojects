package com.example.demo.entity;

import java.math.BigDecimal;

public class ExchangeRate {
	
	private int id;
	
	private String fromCurrency;
	
	private String toCurrency;
	
	private BigDecimal exchangeValue;

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public BigDecimal getExchangeValue() {
		return exchangeValue;
	}

	public void setExchangeValue(BigDecimal exchangeValue) {
		this.exchangeValue = exchangeValue;
	}

	public ExchangeRate(String fromCurrency, String toCurrency, BigDecimal exchangeValue) {
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.exchangeValue = exchangeValue;
	}

	public ExchangeRate() {
	}
	
	

}
