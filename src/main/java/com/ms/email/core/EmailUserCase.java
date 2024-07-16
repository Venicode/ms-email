package com.ms.email.core;

public interface EmailUserCase {
    void sendEmail(String emailTo, String subject, String body);
}
