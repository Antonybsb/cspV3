package io.csp;

import io.csp.model.entity.Cliente;
import io.csp.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CspAplication {


    public static void main(String[] args) {
        SpringApplication.run(CspAplication.class, args);
    }
}