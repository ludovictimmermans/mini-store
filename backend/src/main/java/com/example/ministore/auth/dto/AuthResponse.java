package com.example.ministore.auth.dto;

import com.example.ministore.user.Role;

/**
 * Authentication response returned after a successful login.
 * Contains the issued JWT token and basic user identity information.
 */
public record AuthResponse(

        /**
         * Signed JWT token used for authenticated requests.
         */
        String token,

        /**
         * Unique identifier of the authenticated user.
         */
        Long id,

        /**
         * User email.
         */
        String email,

        /**
         * Role assigned to the user (USER, ADMIN).
         */
        Role role) {
}