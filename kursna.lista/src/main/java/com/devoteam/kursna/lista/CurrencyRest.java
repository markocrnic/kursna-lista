package com.devoteam.kursna.lista;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyRest {
	
	@RequestMapping(value = "/getCurrency", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Currencies> getCurrencies() throws KeyManagementException, NoSuchAlgorithmException {
		
		RestClient rest = new RestClient();
		Currencies response = rest.get("/getCurrencies/get");
		return new ResponseEntity<Currencies>(response, HttpStatus.OK);
	}

}
