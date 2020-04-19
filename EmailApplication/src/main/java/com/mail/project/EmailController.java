package com.mail.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
	@Autowired
	EmailUtil b;
	
	@RequestMapping(value = "/sendemail")
	public String sendEmail() {
	b.sendEmail("jamesjeniffer72@gmail.com","hello jeni","welcome");
		return "Email sent successfully";
	}

}