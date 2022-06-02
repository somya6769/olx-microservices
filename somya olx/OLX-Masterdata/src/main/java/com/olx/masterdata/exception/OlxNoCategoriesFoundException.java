package com.olx.masterdata.exception;

public class OlxNoCategoriesFoundException extends Exception {
	String message;

	public OlxNoCategoriesFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OlxNoCategoriesFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public OlxNoCategoriesFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OlxNoCategoriesFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public OlxNoCategoriesFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
