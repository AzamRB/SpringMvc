package springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","Azam Bagwan");
		model.addAttribute("id",313);
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("iron man");
		movies.add("bat man");
		movies.add("super man");
		movies.add("thor");

		model.addAttribute("movies", movies);
		
/*		for some cause it is throwing an error java.lang.ClassCastException
		java.util.Arrays$ArrayList cannot be cast to java.util.ArrayList] with root cause*/
//		ArrayList fruits = (ArrayList) Arrays.asList("mango","apple","banana","Strawberry");
//		model.addAttribute("fruits",fruits);
		
		LocalDateTime time = LocalDateTime.now();
		model.addAttribute("Time",time);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		//Creating Model and view
		ModelAndView modelAndView = new ModelAndView();
		
		//Setting data
		modelAndView.addObject("name","AZAM");
		modelAndView.addObject("RollNumber",234);
		LocalDateTime time = LocalDateTime.now();
		modelAndView.addObject("time",time);
		//setting view name(page name)
		modelAndView.setViewName("help");
		return modelAndView;
	}
	

}
