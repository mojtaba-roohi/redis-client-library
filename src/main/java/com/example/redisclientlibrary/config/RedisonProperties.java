package com.example.redisclientlibrary.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "scores-redis")
@EnableConfigurationProperties
@Configuration
public class RedisonProperties {
    private String address;

    private String password;

    private boolean cluster;

    private String prefix;


}
