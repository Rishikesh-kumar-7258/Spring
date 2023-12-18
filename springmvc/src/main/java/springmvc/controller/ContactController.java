package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model model) {
		model.addAttribute("heading", "This is header");
		model.addAttribute("desc", "This is desc");
	}
	
	@RequestMapping(path="/contact")
	public String showForm() {
		return "view";
	}
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
//		System.out.println(user);
		this.userService.createUser(user);
		
		return "success";
	}
	
	/*
	 * @RequestMapping(path="/processForm", method=RequestMethod.POST) public String
	 * handleForm(HttpServletRequest reqeust) {
	 * 
	 * String name = reqeust.getParameter("name");
	 * System.out.println("The name of user is " + name); return ""; }
	 */
	
//	@RequestMapping(path="/processForm", method=RequestMethod.POST)
//	public String handleForm(@RequestParam("name") String name, 
//							@RequestParam("email") String email, 
//							@RequestParam("password") String password,
//							Model model) {
//		
//		User user = new User();
//		user.setEmail(email);
//		user.setName(name);
//		user.setPassword(password);
//		
////		System.out.println("User Name : " + name);
////		System.out.println("User Email : " + email);
////		System.out.println("User Password : " + password);
//		
//		System.out.println(user);
//		
//		// process data
////		model.addAttribute("name", name);
////		model.addAttribute("email", email);
////		model.addAttribute("password", password);
//		
//		model.addAttribute("user", user);
//		
//		return "success";
//	}
}
