package br.com.predicao.controllers
;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "home";
	}
	
	@RequestMapping("/predicao")
	public String home(){
		return "home";
	}
	

	@RequestMapping("/businessanalytics")
	public String ba(){
		return "home";
	}
}