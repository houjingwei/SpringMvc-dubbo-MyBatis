package com.dsp.cache.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dsp.model.User;
import com.dsp.service.cache.CacheService;
import com.dsp.utils.helper.SerializeUtil;

import junit.framework.TestCase;

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
    	user.setUsername("123");
    	cacheService.add("user1", user, 1);
    	User user2 =  (User) cacheService.get("user1");
    	System.out.println(user2.getUsername());
        
    } 
    
    
    @Test
    public void addList(){ 
    	List<User> list = new ArrayList<User>();
    	for (int i = 0; i < 10; i++) {
    		User user = new User();
        	user.setUsername("user"+i);
        	list.add(user);
		}
    	cacheService.addList("list", list, 1);
    	System.out.println(new Date());
    	System.out.println(new Date());
    	List<User> uu =  (List) cacheService.getList("list");
    	for(User u :uu){
    		System.out.println("****"+u.getUsername()+"*****");
    	}
        
    } 
    
    
    @Test
    public void inc(){ 
    	List<User> list = new ArrayList<User>();
    	for (int i = 0; i < 10; i++) {
    		User user = new User();
        	user.setUsername("user"+i);
        	list.add(user);
		}
    	long count = 1;
    	cacheService.increment("c", count);
    	cacheService.increment("c", count);
    	cacheService.increment("c", count);
    } 
}
