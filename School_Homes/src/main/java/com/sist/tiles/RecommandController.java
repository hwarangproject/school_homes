package com.sist.tiles;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import com.sist.dao.RecommandDAO;

@Controller
public class RecommandController {
	@Autowired
	private RecommandDAO rdao;
	
	@RequestMapping("main/recommand.do")
	public String main_recommand(Model model){
		ArrayList<String> dongList = rdao.getDongList();
		
		
		// jsonArray로 변환
		JSONArray arr=new JSONArray();
		for(String dong:dongList)
		{
			arr.add(dong);
			System.out.println(dong);
		}
		model.addAttribute("list", arr.toJSONString());
		return "main/recommand";
	}
	
	
	
}
