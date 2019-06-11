package com.sist.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("main/main.do")
	public String main_main(){
		return "main";
	}
	
	@RequestMapping("main/bu_analysis.do")
	public String main_bu_analysis(){
		return "main/bu_analysis";
	}
}
