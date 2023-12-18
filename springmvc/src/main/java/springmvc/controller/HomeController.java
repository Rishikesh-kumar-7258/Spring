package springmvc.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Rishikesh Kumar");
		
		/*
		 * List<Integer> marks = new ArrayList<Intger>(); marks.add(20); marks.add(50);
		 * marks.add(60);
		 * 
		 * model.addAttribute("marks", marks);
		 */
			
		
		return "index";
	}
	
	@RequestMapping(path="/about", method = RequestMethod.POST)
	public String About() {
		System.out.println("This is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView Help() {
		
		System.out.println("This is help page");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("help");
		
		
		mv.addObject("name", "Rishikesh Kumar");
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(50);
		marks.add(30);
		marks.add(90);
		
		mv.addObject("marks", marks);
		
		return mv;
	}

}
