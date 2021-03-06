package com.jpa.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.jpa.dao.UserDaoInt;
import com.jpa.entities.User;
import com.jpa.services.UserServiceInt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class PersistanceTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserServiceInt userService;
    
    @Test
    public void testPersistance(){
    	User user = userService.getUser(2);
    	//test if the returned user.name = "osama", pre-added to the database
    	Assert.assertEquals("osama" , user.getName());
    }

}
