package com.educandoweb.course.services.exceptions;

public class ResourcerNotFoundException extends RuntimeException{

    public ResourcerNotFoundException(Object id){
        super("Resource not found. Id: " + id);
    }
}
