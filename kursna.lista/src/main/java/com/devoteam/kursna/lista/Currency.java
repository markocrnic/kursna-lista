package com.devoteam.kursna.lista;

public class Currency {
	
	private Integer code;
	private String country;
	private String currency;
	private Integer amount;
	private Double buying;
	private Double middle;
	private Double selling;
	
	public Currency(Integer code, String country, String currency, Integer amount, Double buying, Double middle,
			Double selling) {
		super();
		this.code = code;
		this.country = country;
		this.currency = currency;
		this.amount = amount;
		this.buying = buying;
		this.middle = middle;
		this.selling = selling;
	}
	
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getBuying() {
		return buying;
	}

	public void setBuying(Double buying) {
		this.buying = buying;
	}

	public Double getMiddle() {
		return middle;
	}

	public void setMiddle(Double middle) {
		this.middle = middle;
	}

	public Double getSelling() {
		return selling;
	}

	public void setSelling(Double selling) {
		this.selling = selling;
	}

}
