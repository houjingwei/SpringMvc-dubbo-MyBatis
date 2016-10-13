package com.dsp.cache.component;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.dsp.model.User;
import com.dsp.service.cache.CacheService;


import junit.framework.TestCase;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class AppTest  extends TestCase {
	
    @Autowired CacheService cacheService;
    
    @Test
    public void cacheTest(){  
    	User user = new User();
    	
    	User user2 = (User) cacheService.get("user");
    	System.out.println(user2);
        
    } 
}
