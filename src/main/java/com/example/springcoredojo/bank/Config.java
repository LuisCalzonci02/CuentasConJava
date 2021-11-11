package com.example.springcoredojo.bank;

import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public Sucursal getYoutuber(){
        return new Sucursal("sucursal de banamex");
    }
}
