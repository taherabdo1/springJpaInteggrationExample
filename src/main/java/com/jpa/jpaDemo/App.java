package com.jpa.jpaDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.dao.UserDaoInt;
import com.jpa.entities.User;
import com.jpa.services.UserServiceInt;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		UserServiceInt userService = (UserServiceInt) ctx.getBean("userService");

		User user = userService.getUser(2);
		System.out.println("User name: " + user.getName());


    }
}
