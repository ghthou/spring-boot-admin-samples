package com.github.ghthou.spring.boot.admin.samples.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ghthou.spring.boot.admin.samples.commons.config.SpringSecurityConfig;

@RestController
@SpringBootApplication
@ImportAutoConfiguration(SpringSecurityConfig.class)
public class ClientApplication {

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
