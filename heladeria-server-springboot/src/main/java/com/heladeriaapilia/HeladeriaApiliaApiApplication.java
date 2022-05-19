package com.heladeriaapilia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackages = { "com.heladeriaapilia", "com.heladeriaapilia.api", "com.heladeriaapilia.configuration" })
public class HeladeriaApiliaApiApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplication(HeladeriaApiliaApiApplication.class).run(args);
    }
}
