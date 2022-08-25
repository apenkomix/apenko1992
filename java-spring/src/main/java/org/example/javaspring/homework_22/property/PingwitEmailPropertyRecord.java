package org.example.javaspring.homework_22.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "pingwit.email")
public record PingwitEmailPropertyRecord(String from, String signature) {
}
