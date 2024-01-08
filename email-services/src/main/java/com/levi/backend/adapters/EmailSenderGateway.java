package com.levi.backend.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
