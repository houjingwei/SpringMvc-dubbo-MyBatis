package org.dsp.user.component;

import java.util.List;

import org.dsp.model.User;
import org.dsp.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */


@RunWith(SpringJUnit4ClassRunner.class) // 整合 
@ContextConfiguration(locations="classpath:spring-context.xml") // 加载配置
public class AppTest  extends TestCase
{
	
	@Autowired // 注入
	private UserService userService;
    
	@Test  
    public void findUserList()  
    {  
        List<User> list = userService.findList();
        System.out.println(list.get(0).getName());
    } 

    
}
