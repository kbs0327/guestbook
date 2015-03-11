package com.toast.guestbook.controller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toast.guestbook.vo.Post;

/**
 * Handles requests for the application home page.
 */
@Controller
public class GuestBookController {
	
	static final String EMAIL_ERROR_MSG = "이메일이 형식이 맞지 않습니다.";
	static final String PASSWORD_ERROR_MSG = "비밀번호 형식에 맞지 않습니다.";
	
	private static final Logger logger = Logger.getLogger(GuestBookController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public String postNewInput(@ModelAttribute Post post) {
		
		
		return "redirect:/";
	}
	
}
