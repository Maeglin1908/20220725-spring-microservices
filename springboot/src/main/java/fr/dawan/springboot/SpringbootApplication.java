package fr.dawan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
	    SpringApplication.run(SpringbootApplication.class, args);
	   // SpringApplication app=new SpringApplication(SpringbootApplication.class);
	   // app.setAddCommandLineProperties(false);
	 //   app.setBannerMode(Mode.OFF);
	  //  app.run(args);

	}

//	@Bean
//	public ServiceRunner servrun() {
//	    return new ServiceRunner();
//	}

}
