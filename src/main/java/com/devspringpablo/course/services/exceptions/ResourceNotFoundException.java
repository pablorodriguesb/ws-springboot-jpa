package com.devspringpablo.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) { // caso recurso nao encontrado
        super("Resource not found. Id " + id);
    }
}
