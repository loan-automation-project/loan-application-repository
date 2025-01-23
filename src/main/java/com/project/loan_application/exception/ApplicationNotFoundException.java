package com.project.loan_application.exception;

public class ApplicationNotFoundException extends RuntimeException {



	    public ApplicationNotFoundException(String message) {
	        super(message);
	    }

	    public ApplicationNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	

}
