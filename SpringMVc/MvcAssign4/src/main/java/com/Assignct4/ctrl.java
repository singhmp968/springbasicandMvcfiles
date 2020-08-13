package com.Assignct4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Model.movieModel;
@Controller
public class ctrl {

	@RequestMapping("/movies")
	public String topMovies(Model model) {
		movieModel mm = new movieModel();
		List<String> li = new ArrayList<String>();
		mm.setMoviName("movie1");
		li.add(mm.getMoviName());
		movieModel mm2 = new movieModel();
		mm2.setMoviName("bjkl");
		li.add(mm2.getMoviName());
	
		movieModel mm3 = new movieModel();
		mm3.setMoviName("sherk");
		li.add(mm3.getMoviName());

		movieModel mm4 = new movieModel();
		mm4.setMoviName("shinchan");
		li.add(mm4.getMoviName());

		movieModel mm5 = new movieModel();
		mm5.setMoviName("Sacred games");
		li.add(mm5.getMoviName());

		movieModel mm6 = new movieModel();
		mm6.setMoviName("bulb");
		li.add(mm6.getMoviName());

		
		movieModel mm7 = new movieModel();
		mm7.setMoviName("dangal");
		li.add(mm7.getMoviName());

		movieModel mm8 = new movieModel();
		mm8.setMoviName("the boys");
		li.add(mm7.getMoviName());

		movieModel mm9 = new movieModel();
		mm9.setMoviName("hitman");
		li.add(mm9.getMoviName());

		movieModel mm10 = new movieModel();
		mm10.setMoviName("Sacred games season 2");
		li.add(mm10.getMoviName());

		
		model.addAttribute("movies",li);
		return "home";

	}

	
	
}
