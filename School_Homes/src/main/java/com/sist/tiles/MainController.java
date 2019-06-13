package com.sist.tiles;

import java.util.ArrayList;
import java.util.List;
import com.sist.vo.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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

	@Autowired
	private SchoolDAO schdao;
	
	@RequestMapping("main/main.do")
	public String main_main() {

		List<AptVO> list = aptdao.aptAllData();
		System.out.println(list.size());
		System.out.println(list.get(0).getAPT_NAME());

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
	
	
	@RequestMapping("main/schoolinfo.do")
	public String main_schoolinfo(Model model){
		
		List<highSchool_GraduateVO> schlist=schdao.schoolAllData();
		model.addAttribute("schlist",schlist);
		
		List<highSchool_SeoulVO> seoullist=schdao.seoulAllData();
		model.addAttribute("seoullist",seoullist);
		
		highSchool_GraduateVO vo=schdao.schoolDetailData();
		model.addAttribute("vo", vo);
//		JSONArray arr=new JSONArray();
//		for(highSchool_GraduateVO vo:schlist)
//		{
//			JSONObject obj=new JSONObject();
//			obj.put("total", vo.getHIRED_TOTAL());
//			
//			arr.add(obj);
//		}
//		model.addAttribute("graduatedata", arr.toJSONString());
		
		return "main/schoolinfo";
	}
	
	@RequestMapping("main/bu_detail.do")
	public String main_bu_detail(){
		return "main/bu_detail";
	}

}
