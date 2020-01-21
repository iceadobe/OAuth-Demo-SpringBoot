package iceadobe.learning.spring.securityoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"iceadobe.learning.spring"})
public class SecurityOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityOauthApplication.class, args);
    }

}
