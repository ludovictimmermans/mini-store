package com.example.ministore.auth;

/**
 * Thrown when authentication fails (wrong email or password).
 * Message kept generic on purpose.
 */
public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException() {
        super("Invalid email or password");
    }
}