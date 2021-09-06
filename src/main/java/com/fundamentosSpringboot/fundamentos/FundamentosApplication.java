package com.fundamentosSpringboot.fundamentos;
import com.fundamentosSpringboot.fundamentos.bean.MyBean;
import com.fundamentosSpringboot.fundamentos.component.ComponentDepency;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication /*implements CommandLineRunner*/ {
	/*private ComponentDepency componentDepency;
	private MyBean myBean;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDepency componentDepency, MyBean myBean){
		this.componentDepency = componentDepency;
		this.myBean = myBean;

	}*/

	public static void main(String[] args) {

		SpringApplication.run(FundamentosApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		componentDepency.saludar();
		myBean.print();
	}*/
}
