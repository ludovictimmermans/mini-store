package com.example.ministore.auth.dto;

import com.example.ministore.user.Role;

public record AuthResponse(
        String token,
        Long id,
        String email,
        Role role) {
}
