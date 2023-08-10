package com.nanda.springbootembeddeddebeziummssql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootDebeziumMssqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDebeziumMssqlApplication.class, args);
	}

}
