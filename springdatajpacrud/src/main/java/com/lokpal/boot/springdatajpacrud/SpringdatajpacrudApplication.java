package com.lokpal.boot.springdatajpacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lokpal.boot.springdatajpacrud.dao.UserRepository;
import com.lokpal.boot.springdatajpacrud.entity.User;

@SpringBootApplication
public class SpringdatajpacrudApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext contex=SpringApplication.run(SpringdatajpacrudApplication.class, args);
	
	UserRepository userRepository = contex.getBean(UserRepository.class);
	
	User user=new User();
	user.setName("Lokpal Rathod");
	user.setCity("Sambhajinagar");
	user.setStatus("I am Backend Devoloper");
	
	User user1 = userRepository.save(user);
	
	System.out.println(user1);
	
	}

}
