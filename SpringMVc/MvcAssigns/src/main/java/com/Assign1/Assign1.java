package com.Assign1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Assign1 {
@RequestMapping("/home")
public String home(Model model) {
	System.out.println("thi sis hellow woeld");
	model.addAttribute("name" ,"hello world");
	
	return"index";
}
}
