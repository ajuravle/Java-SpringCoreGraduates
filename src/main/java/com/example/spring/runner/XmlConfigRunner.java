package com.example.spring.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.repository.UserRepository;

public class XmlConfigRunner implements ConfigRunner{

	private static final String SPRING_BEANS_XML_FILENAME = "SpringBeans.xml";

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getName());
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(SPRING_BEANS_XML_FILENAME);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		System.out.println(userRepository.toString());
		
	}

}
