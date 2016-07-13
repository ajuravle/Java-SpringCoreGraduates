package com.example.spring.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.config.Config;
import com.example.spring.controller.UserController;
import com.example.spring.domain.User;

public class JavaConfigRunner implements ConfigRunner {

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getName());
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		UserController userController = context.getBean(UserController.class);
		User u = new User("John", "John");
		System.out.println("------------> "+u);
		userController.createUser(u);

		context.registerShutdownHook();
	}

}
