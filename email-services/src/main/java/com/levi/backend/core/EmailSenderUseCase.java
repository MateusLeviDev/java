package com.levi.backend.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
