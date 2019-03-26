package gt.edu.umg.ia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainViewController {

	@GetMapping("/")
	public String home(Model model) {
		return "home";
	}
}
