package br.com.casadocodigo.loja.conf;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceConfigurationTest {
	
	@Bean
	@Profile("test")
	public DataSource dataSource() {
		
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUsername("admin");
		driverManagerDataSource.setPassword("admin");
		driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/casadocodigo_test");
		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
	
		return driverManagerDataSource;
	}

}
