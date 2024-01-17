package K24.bgx151.Jouni.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {
	
	@RequestMapping("/index")
	@ResponseBody
	public String returnMessage() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	@ResponseBody
	public String returnMessage2() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String returnHello(
			@RequestParam(value="location", required=false, defaultValue="moon") String location,
			@RequestParam(value="name", required=false, defaultValue="John") String name) {
	    return "Welcome to the " + location + " " + name;
	}


}


