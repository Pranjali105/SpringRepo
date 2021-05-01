package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String getSugar()
	{
		return "Hey... It's your Sugar...";
	}
	
	@RequestMapping("/MomSugar")
	public String getMomSugar()
	{
		System.out.println("In Mom's Sugar method...");
		return "MomSugarView";
	}

}
