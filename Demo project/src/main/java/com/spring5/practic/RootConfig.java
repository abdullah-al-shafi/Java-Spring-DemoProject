package com.spring5.practic;

import org.springframework.context.annotation.ComponentScan;

//@Configuration(Only write been inside class)
@ComponentScan(basePackages = {"com.spring5.practic.services"})

public class RootConfig {

//	@Bean
//	public Student user() {
//		var user = new Student();
//		user.setName("Abdullah");
//		return user;
//	}
}
