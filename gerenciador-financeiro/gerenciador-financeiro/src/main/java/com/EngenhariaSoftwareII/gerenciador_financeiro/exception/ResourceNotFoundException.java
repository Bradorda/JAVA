package com.EngenhariaSoftwareII.gerenciador_financeiro.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
