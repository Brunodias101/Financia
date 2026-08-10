package com.bruno101dias.financia.exception;

public class CategoriaNotFoundException extends RuntimeException {

    public CategoriaNotFoundException(Long id) {
        super("Categoria não encontrada: " + id);
    }
}