package com.example.ministore.auth.dto;

import com.example.ministore.user.Role;

public record UserResponse(
        Long id,
        String email,
        Role role) {
}
