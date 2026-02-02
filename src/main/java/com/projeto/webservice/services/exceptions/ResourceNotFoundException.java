package com.projeto.webservice.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final Long serialVersionUID = 1L;

    public ResourceNotFoundException (Object id){
        super("Resource not found. Id: " + id);
    }

}
