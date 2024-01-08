package com.levi.backend.core;

public record EmailRequest(
        String to,
        String subject,
        String body
) {
}
