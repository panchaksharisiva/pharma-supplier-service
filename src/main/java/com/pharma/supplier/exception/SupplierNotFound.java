package com.pharma.supplier.exception;

public class SupplierNotFound extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public SupplierNotFound(String message) {
		super(message);

		/*
		 * @Override public HttpHeaders getResponseHeaders() { // return response
		 * headers }
		 */
	}
}
