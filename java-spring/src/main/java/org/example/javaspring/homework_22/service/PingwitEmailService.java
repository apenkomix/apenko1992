package org.example.javaspring.homework_22.service;

import org.example.javaspring.homework_22.dto.EmailDto;
import org.example.javaspring.homework_22.property.PingwitEmailPropertyRecord;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class PingwitEmailService {
    private final JavaMailSender mailSender;
    private final PingwitEmailPropertyRecord pingwitEmailPropertyRecord;

    public PingwitEmailService(JavaMailSender mailSender, PingwitEmailPropertyRecord pingwitEmailPropertyRecord) {
        this.mailSender = mailSender;
        this.pingwitEmailPropertyRecord = pingwitEmailPropertyRecord;
    }

    public boolean send(EmailDto emailDto) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(pingwitEmailPropertyRecord.from());
            mailMessage.setTo(emailDto.to());
            mailMessage.setSubject(emailDto.subject());
            mailMessage.setText(emailDto.text() + "\n" + pingwitEmailPropertyRecord.signature());
            mailSender.send(mailMessage);
        } catch (Exception e) {
            System.out.println("Error while sending message" + e.getMessage());
            return false;
        }
        return true;
    }
}
