package com.assecods.exception;

public class InvoiceNotFoundException extends RuntimeException {

    public InvoiceNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
