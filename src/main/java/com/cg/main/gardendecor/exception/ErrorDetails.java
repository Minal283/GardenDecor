package com.cg.main.gardendecor.exception;

import java.time.LocalDate;

public class ErrorDetails {

	private String message;
	private LocalDate date;
	private String details;

	public ErrorDetails() {
		/**
		 * Auto generated stub-constructor
		 */

	}

	/**
	 * constructor using fields
	 * 
	 * @param message
	 * @param date
	 * @param details
	 */

	public ErrorDetails(String message, LocalDate date, String details) {
		super();
		this.message = message;
		this.date = date;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 */

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @return getDate
	 */

	public LocalDate getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 */

	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * 
	 * @return getDetails
	 */

	public String getDetails() {
		return details;
	}

	/**
	 * 
	 * @param details
	 */
	

	public void setDetails(String details) {
		this.details = details;
	}

}
