package com.example.springcoredojo;

import com.example.springcoredojo.bank.Cliente;
import com.example.springcoredojo.bank.CuentaAhorro;
import com.example.springcoredojo.bank.CuentaServices;
import com.example.springcoredojo.bank.Sucursal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring2DojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2DojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			Cliente clienteone = ctx.getBean(Cliente.class);
			System.out.println(clienteone);

			CuentaServices cuentaServices = ctx.getBean(CuentaServices.class);
			System.out.println(cuentaServices.getClass().getName()+cuentaServices.getCuenta().retiroCuenta( 200));
		};
	}


}
