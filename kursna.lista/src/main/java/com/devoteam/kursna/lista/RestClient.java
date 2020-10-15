package com.devoteam.kursna.lista;

import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {
	
	private String server = "https://5f58a59b8040620016ab8462.mockapi.io";
	private RestTemplate rest;
	private HttpHeaders headers;
	private HttpStatus status;
	
	public RestClient() throws KeyManagementException, NoSuchAlgorithmException {
	    this.rest = new RestTemplate();
	    this.headers = new HttpHeaders();
	    String auth = "5301db3f" + ":" + "7fb3211eddbed9b364310074c9c755e1";
        byte[] encodedAuth = Base64.encodeBase64( 
           auth.getBytes(Charset.forName("US-ASCII")) );
        String authHeader = "Basic " + new String( encodedAuth );
	    headers.add("Content-Type", "application/json");
	    headers.add("Accept", "*/*");
	    headers.add("Authorization", authHeader);
	    SSLUtil.turnOffSslChecking();
	}
	
	public Currencies get(String uri) {
	    HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
	    ResponseEntity<Currencies> responseEntity = rest.exchange(server + uri, HttpMethod.GET, requestEntity, Currencies.class);
	    this.setStatus(responseEntity.getStatusCode());
	    return responseEntity.getBody();
	 }
	
	public HttpStatus getStatus() {
	    return status;
	}

	public void setStatus(HttpStatus status) {
	    this.status = status;
	} 

}
