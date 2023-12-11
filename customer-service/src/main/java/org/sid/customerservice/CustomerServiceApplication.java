package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Customer.class);
            customerRepository.saveAll(
                List.of(
                        Customer.builder().name("Charafeddine").email("Charaf@me.com").build(),
                        Customer.builder().name("Salwa").email("salwa@me.com").build(),
                        Customer.builder().name("Saad").email("saad@me.com").build(),
                        Customer.builder().name("Yahia").email("yahia@me.com").build()

                )
        );
        customerRepository.findAll().forEach(c->{
            System.out.println(c.toString());
        });
        };
        }
    }



