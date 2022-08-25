package org.example.javaspring.homework_22.service;

import org.example.javaspring.homework_22.property.EmailProperty;
import org.example.javaspring.homework_22.property.EmailPropertyConstructorBinding;
import org.example.javaspring.homework_22.property.EmailPropertyRecord;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final EmailProperty emailProperty;
    private final EmailPropertyConstructorBinding emailPropertyConstructorBinding;
    private final EmailPropertyRecord emailPropertyRecord;

    public EmailService(EmailProperty emailProperty, EmailPropertyConstructorBinding emailPropertyConstructorBinding, EmailPropertyRecord emailPropertyRecord) {
        this.emailProperty = emailProperty;
        this.emailPropertyConstructorBinding = emailPropertyConstructorBinding;
        this.emailPropertyRecord = emailPropertyRecord;
    }
}
