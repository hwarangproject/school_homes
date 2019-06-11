package com.sist.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("main/main.do")
	public String main_main(){
		return "main";
	}
	
	@RequestMapping("main/menu.do")
	public String main_menu(){
		return "main";
	}
	
	@RequestMapping("main/recommand.do")
	public String main_recommand(){
		return "main/recommand";
	}
	
	@RequestMapping("main/seouluniv.do")
	public String main_seouluniv(){
		return "main/seouluniv";
	}
	
	@RequestMapping("main/schoolrate.do")
	public String main_schoolrate(){
		return "main/schoolrate";
	}
	
	@RequestMapping("main/bu_detail.do")
	public String main_bu_detail(){
		return "main/bu_detail";
	}
}
