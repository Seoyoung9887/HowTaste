package com.howtaete.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	    @ResponseBody
	    @RequestMapping("/test1")
	    public String helloWorld() {
	        return "Hello world!";
	    }
	    @ResponseBody
	    @RequestMapping("/test2")
	    public Map<String,Object> test2(){
	    	Map<String,Object> test2 = new HashMap<>();
	    	test2.put("안녕", "하이");
	    	return test2;
	    }
	    @RequestMapping("/test3")
		public String test3() {
			return"test/test";
		}
	

}
