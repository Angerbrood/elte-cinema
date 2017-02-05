package hu.elte.cinema.configuration;

import hu.elte.cinema.util.ConverterRegister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
@Import(ServiceConfig.class)
public class ApplicationConfig {

    @Bean
    ConversionService conversionService() {
        return new DefaultConversionService();
    }
    @Bean
    ConverterRegister converterRegister() {
        return new ConverterRegister();
    }
}
