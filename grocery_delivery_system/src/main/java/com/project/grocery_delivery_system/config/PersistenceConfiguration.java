package com.project.grocery_delivery_system.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class PersistenceConfiguration {

	@SuppressWarnings("rawtypes")
	@Bean
	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		
		dataSourceBuilder.url("jdbc:postgresql://localhost:5432/grocery_delivery_system?user=postgres&password=Chair@1sofa");
		return dataSourceBuilder.build();
	}
}
