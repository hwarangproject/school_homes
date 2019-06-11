package com.sist.tiles;

import java.util.ArrayList;
import java.util.List;
import com.sist.vo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sist.dao.*;
@Controller
public class MainController {
	@Autowired
	private AptDAO aptdao; 
	@Autowired 
	private OfficeDAO offdao;
	
	@RequestMapping("main/main.do")
	public String main_main(){
		
		List<AptVO> list = aptdao.aptAllData();
		System.out.println(list.size());
		System.out.println(list.get(0).getAPT_NAME());
		
		return "main";
	}
	
	@RequestMapping("main/select.do")
	public String main_Test(Model model){	
		List<OfficetelVO> list = offdao.OfficetestData("대전광역시 동구");
		
		/*List<String> aptlist = new ArrayList<String>();
		
		for(AptVO vo : list)
		{
			String temp ="";
			if(!vo.getAPT_NUMBER_SUB().equals("0"))
			{
				temp = vo.getAPT_NUMBER_SUB()+" ";
			}
			String s =vo.getAPT_ADDR()+" "+vo.getAPT_NUMBER_MAIN()+" "+temp;
			System.out.println(s);
			
			aptlist.add(s);
		}*/
		
		List<String> aptlist = new ArrayList<String>();
		
		for(OfficetelVO vo : list)
		{
			String temp ="";
			if(!vo.getOFF_NUMBER_SUB().equals("0"))
			{
				temp = vo.getOFF_NUMBER_SUB()+" ";
			}
			String s =vo.getOFF_ADDR()+" "+vo.getOFF_NUMBER_MAIN()+" "+temp;
			System.out.println(s);
			
			aptlist.add(s);
		}
 		
		System.out.println(list.size());
		model.addAttribute("aptlist", aptlist);
		return "main/test";
	}
	
}
