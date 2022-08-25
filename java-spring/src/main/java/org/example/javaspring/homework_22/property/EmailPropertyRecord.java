package org.example.javaspring.homework_22.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.mail")
public record EmailPropertyRecord (String host, String port, String username, String password) {
}
