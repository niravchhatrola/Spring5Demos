package com.chhatrola.Spring5Demos;

import com.chhatrola.Spring5Demos.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5DemosApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring5DemosApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");

		System.out.println(myController.greetings());
	}

}
