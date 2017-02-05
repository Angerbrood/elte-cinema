package hu.elte.cinema.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"hu.elte.cinema.converter"})
public class ServiceConfig {
}
