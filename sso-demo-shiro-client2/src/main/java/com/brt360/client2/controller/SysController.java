package com.brt360.client2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysController {
	
	@RequestMapping("/sys")
	public String sys() {
		return "sys";
	}

}
