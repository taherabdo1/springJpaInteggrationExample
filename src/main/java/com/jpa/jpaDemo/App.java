package com.jpa.jpaDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.dao.UserDaoInt;
import com.jpa.entities.User;

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

		UserDaoInt userDao = (UserDaoInt) ctx.getBean("userDao");

		User user = userDao.getById(2);
		System.out.println("User name: " + user.getName());


    }
}
