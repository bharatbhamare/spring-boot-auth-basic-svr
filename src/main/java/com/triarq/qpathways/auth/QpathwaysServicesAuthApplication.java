package com.triarq.qpathways.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class QpathwaysServicesAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(QpathwaysServicesAuthApplication.class, args);
	}
}
