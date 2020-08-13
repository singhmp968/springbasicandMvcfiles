package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;


@Controller
public class ctrl {

	@RequestMapping("/form")
	public String showForm(Model m) {
		System.out.println("Creating");
		return "marksform";
	}
	
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("science")int science,
			@RequestParam("maths")int maths,
			@RequestParam("english")int english,Model model )
			 {
	User user = new User();
		System.out.println(user);
		
		
		
		user.setScience(science);
		user.setMaths(maths);;
		user.setEnglish(english);;
		model.addAttribute("user",user);


		return"sucess";
	}


}
