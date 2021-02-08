package com.cg.main.gardendecor.exception;

public class GardenDecorNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GardenDecorNotFoundException() {
		
	}
	/**
	 * 
	 * @param message
	 */

	public GardenDecorNotFoundException(String message) {
		super(message);
	}
}
