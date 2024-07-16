package com.ms.email.adapters;

public interface EmailAdapter {
    void sendEmail(String emailTo, String subject, String body);
}
