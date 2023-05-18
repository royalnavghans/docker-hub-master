package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerHubApplication.class, args);
    }

    @GetMapping("/users")
    public String getMessage() {
        return "Message from Royalnavghan AWS EC2 deployed through Docker Using Jenkins succesfully";
    }

}
