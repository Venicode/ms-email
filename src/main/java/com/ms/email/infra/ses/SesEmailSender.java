package com.ms.email.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.ms.email.adapters.EmailAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailAdapter {

    @Autowired
    private AmazonSimpleEmailService amazonSimpleEmailService;

    @Override
    public void sendEmail(String emailTo, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("vitoracida13@gmail.com")
                .withDestination(new Destination().withToAddresses(emailTo))
                .withMessage(new Message().withSubject(new Content(subject)).
                        withBody(new Body().withText(new Content(body))));
        try{
            amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException exception){
            throw new RuntimeException(exception.getMessage());
        }
    }
}
