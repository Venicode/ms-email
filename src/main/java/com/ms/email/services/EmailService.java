package com.ms.email.services;

import com.ms.email.adapters.EmailAdapter;
import com.ms.email.core.EmailUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements EmailUserCase {
    @Autowired
    private EmailAdapter emailAdapter;

    @Override
    public void sendEmail(String emailTo, String subject, String body) {
        this.emailAdapter.sendEmail(emailTo, subject, body);
    }
}
