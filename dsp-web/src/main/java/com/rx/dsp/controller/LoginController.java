package com.rx.dsp.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dsp.model.User;
import com.dsp.service.user.UserService;
import com.rx.dsp.shiro.ShiroSessionUtils;

@Controller
public class LoginController {

	@Resource // 注入
	private UserService userService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
    public String home(String username,String password,Map map){
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);   
        Subject currentUser = SecurityUtils.getSubject();   
        try {
			currentUser.login(token);
			User user = ShiroSessionUtils.getLoginUser();
			map.put("user", user);
		} catch (AuthenticationException e) {
			if(e instanceof UnknownAccountException){
				System.out.println("用户不存在");
			}else if(e instanceof IncorrectCredentialsException){
				System.out.println("密码不正确");
			}
		}  
        return "redirect:/home/index"; 
    }
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
    public String toLogin(){
        return  "auth/login"; 
    }
	
	@RequestMapping(value = "/unauthorized")
    public String unauthorizedUrl(){
        return  "auth/unauthorized"; 
    }
	
	@RequestMapping(value = "/logout")
    public String logout(){
		if(null!=SecurityUtils.getSubject().getSession()){
			SecurityUtils.getSubject().logout();
		}else{
			System.out.println("已经退出了");
		}
		return  "redirect:/"; 
    }
}
