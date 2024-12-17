package com.aguiar.demo_park_api.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimzoneConfig {

    @PostConstruct //Apos a execução do metodo contrutor, esse será o proximo metodo a ser executado
    public void timezoneConfig() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
}
