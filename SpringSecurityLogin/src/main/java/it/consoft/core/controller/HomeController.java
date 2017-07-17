package it.consoft.core.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
@RequestMapping("/home/{name}")	
public String test(Map<String,Object> model,@PathVariable String name){
	model.put("name", name);
	
	
	return "home";
}
	
}
