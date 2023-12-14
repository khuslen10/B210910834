package net.javaguides.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import net.javaguides.springboot.repository.UserRepository;
import java.util.List;
import net.javaguides.springboot.model.User;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	 @Autowired 
	  private UserRepository userRepository;
	@GetMapping("/")
	  public String home(Model model) {
	    List<User> users = userRepository.findAll();
	    model.addAttribute("users", users);
	    return "index";
	  }

	@GetMapping("/me")
	public String me() {
		return "aboutme";
	}
}
