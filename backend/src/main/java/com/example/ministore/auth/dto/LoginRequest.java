package com.example.ministore.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * Payload received from the client when attempting to authenticate.
 * Contains raw credentials and must never be persisted.
 */
public record LoginRequest(

        /**
         * User email used as login identifier.
         */
        @Email @NotBlank String email,

        /**
         * Raw password provided by the client.
         * Will be verified against the stored password hash.
         */
        @NotBlank String password) {
}