package com.fundamentosSpringboot.fundamentos;

import com.fundamentosSpringboot.fundamentos.component.ComponentDepency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	private ComponentDepency componentDepency;

	public FundamentosApplication(ComponentDepency componentDepency){
		this.componentDepency = componentDepency;

	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDepency.saludar();
	}
}
