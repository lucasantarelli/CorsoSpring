package it.consoft.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


//running in application server container

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DemoApplication.class);
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(DemoApplication.class, args);
	    }
	
	
}


//caso non con as container ma spring boot
//@SpringBootApplication
//public class DemoApplication {
//
//    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
//
//}