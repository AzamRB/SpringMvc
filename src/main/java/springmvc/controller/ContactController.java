package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Registration Form");
		m.addAttribute("Desp","Welcome Azam's Website");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("contact controller");
		return "contact";
	}
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {  
		
		System.out.println(user);
		this.userService.creatUser(user);

		return "success";
	}

}
/*@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail,
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			Model model) {  //HttpServletRequest request
		
//		String parameter = request.getParameter("email");
//		System.out.println("this is ur email "+parameter);
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(username);
		user.setPassword(password);
		
		System.out.println(user);
		
		System.out.println(" user email "+userEmail);
		System.out.println(" user username "+username);
		System.out.println(" user password "+password);
		
		//we can process data and send to view 
		
//		model.addAttribute("name",username);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password",password);
//		
		model.addAttribute("user",user);
		return "success";
	}

}*/
