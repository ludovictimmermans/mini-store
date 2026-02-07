package com.example.ministore.auth;

import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeController {

    @GetMapping("/api/me")
    public Map<String, Object> me(Authentication authentication) {
        var principal = (JwtAuthFilter.AuthPrincipal) authentication.getPrincipal();
        return Map.of(
                "userId", principal.userId(),
                "email", principal.email());
    }
}
