package com.crudapp.boot.predprodtask312;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "com.crudapp.boot.predprodtask312")
public class PredProdTask312Application {

    public static void main(String[] args) {
        SpringApplication.run(PredProdTask312Application.class, args);
    }

}
