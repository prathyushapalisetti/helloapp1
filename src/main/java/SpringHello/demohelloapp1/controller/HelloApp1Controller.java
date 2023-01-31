package SpringHello.demohelloapp1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp1Controller {
	@RequestMapping(value="/")
	public String hello() {
		return "Hello World";
	}

}
