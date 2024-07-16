package com.ms.email.consumers;

import com.ms.email.core.dtos.EmailDto;
import com.ms.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {
    @Autowired
    private EmailService emailService;
    @RabbitListener(queues = "${broker.queue.email-register.name}")
    public void listenEmailQueue(@Payload EmailDto emailDto){
        this.emailService.sendEmail(emailDto.emailTo(), emailDto.subject(), emailDto.body());
    }
}
