package com.rx.dsp.controller;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.dsp.service.cache.CacheService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.dsp.model.User;
import com.dsp.service.user.UserService;

/**
 * Created by Administrator on 2016/9/12 0012.
 */
@Controller
@RequestMapping
public class HomeController {
	
	@Resource // 注入
	private UserService userService;

    @Resource
    private CacheService cacheService;

    public HomeController(){
        System.out.println("******************************");
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){
        return "home";
    }
    
    
    @RequestMapping(value = "/json",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView json(Model model){
    	Map<String,String> myMap = new HashMap<String,String>();
    	List<User> list = userService.findList();
    	myMap.put("name",list.get(0).getName());
    	myMap.put("email",list.get(0).getEmail()) ;
        return new ModelAndView(new MappingJackson2JsonView(), myMap);
    }

    @RequestMapping(value = "/cache",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView cache(Map model){
        List<User> list = userService.findList();
        cacheService.add("user",list.get(0),1);
        model.put("users",cacheService.get("user"));
        return new ModelAndView(new MappingJackson2JsonView(), model);
    }
}
