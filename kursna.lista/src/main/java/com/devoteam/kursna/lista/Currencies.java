package com.devoteam.kursna.lista;

import java.util.List;

public class Currencies {
	
	private List<Currency> currencies;

	public Currencies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Currencies(List<Currency> currencies) {
		super();
		this.currencies = currencies;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

}
