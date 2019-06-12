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

	@RequestMapping("main/main.do")
	public String main_main() {

		List<AptVO> list = aptdao.aptAllData();
		System.out.println(list.size());
		System.out.println(list.get(0).getAPT_NAME());

		return "main";
	}
	

	@RequestMapping("main/bu_analysis.do")
	public String main_bu_analysis(){
		return "main/bu_analysis";
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

	@RequestMapping("main/select.do")
	public String main_Test(Model model) {
		// List<OfficetelVO> list = offdao.OfficetestData("���쟾愿묒뿭�떆 �룞援�");

		/*
		 * List<String> aptlist = new ArrayList<String>();
		 * 
		 * for(AptVO vo : list) { String temp ="";
		 * if(!vo.getAPT_NUMBER_SUB().equals("0")) { temp =
		 * vo.getAPT_NUMBER_SUB()+" "; } String s
		 * =vo.getAPT_ADDR()+" "+vo.getAPT_NUMBER_MAIN()+" "+temp;
		 * System.out.println(s);
		 * 
		 * aptlist.add(s); }
		 */

		List<OfficetelVO> list = offdao.OfficetestData("대전광역시 동구");
		List<OfficetelVO> off_list = new ArrayList<OfficetelVO>();

		for (OfficetelVO vo : list) {

			// 二쇱냼
			String temp = "";
			if (!vo.getOFF_NUMBER_SUB().equals("0")) {
				temp = vo.getOFF_NUMBER_SUB() + " ";
			}
			String s = vo.getOFF_ADDR() + " " + vo.getOFF_NUMBER_MAIN() + " " + temp;

			OfficetelVO detailvo = offdao.officedetailData(vo.getOFF_NAME());

			System.out.println("test:" + detailvo.getOFF_FOUND_YEAR());

			detailvo.setOFF_ADDR(s);
			detailvo.setOFF_NAME(vo.getOFF_NAME());

			off_list.add(detailvo);

		}

		
		
		JSONArray arr = new JSONArray();
		for (OfficetelVO vo : off_list) {
			JSONObject obj = new JSONObject();
			obj.put("off_name", vo.getOFF_NAME().replace("\"", "").trim());
			obj.put("off_addr", vo.getOFF_ADDR());
			obj.put("off_found_year", vo.getOFF_FOUND_YEAR());
			obj.put("off_price", vo.getOFF_PRICE());
			obj.put("off_area", vo.getOFF_AREA());
			
			System.out.println(vo.getOFF_NAME());
			System.out.println(vo.getOFF_ADDR());
			System.out.println(vo.getOFF_FOUND_YEAR());
			System.out.println(vo.getOFF_PRICE());
			System.out.println(vo.getOFF_AREA());
			arr.add(obj);
		}

		System.out.println(off_list.size());
		model.addAttribute("json", arr.toJSONString());
		return "main/test";
	}

}
