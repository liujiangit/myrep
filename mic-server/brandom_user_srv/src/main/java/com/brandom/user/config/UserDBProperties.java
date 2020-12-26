package com.brandom.user.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user.druid")
public class UserDBProperties extends DruidProperties {

}
