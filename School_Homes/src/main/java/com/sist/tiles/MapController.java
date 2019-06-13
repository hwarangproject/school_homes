package com.sist.tiles;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.OfficeDAO;
import com.sist.vo.OfficetelVO;

@Controller
public class MapController {
	@Autowired
	private OfficeDAO offdao;

	
	@RequestMapping("main/select.do")
	public String main_Test(Model model) {
	

		List<OfficetelVO> list = offdao.OfficetestData("서울특별시 강남구 도곡동");
		List<OfficetelVO> off_list = new ArrayList<OfficetelVO>();
		System.out.println("list.size:"+list.size());
		int i=0;
		for (OfficetelVO vo : list) {
			
			try{
			// 주소 
			String temp = "";
			if (!vo.getNUMBER_SUB().equals("0")) {
				temp = vo.getNUMBER_SUB() + " ";
			}
			String s = vo.getADDR() + " " + vo.getNUMBER_MAIN() + " " + temp;
			
			String off_name="";
			OfficetelVO detailvo = new OfficetelVO();
			if(vo.getBuilding_NAME().contains("\"") || vo.getBuilding_NAME().contains("(")) // 이름에 "(ㅁㅁㅁ)" 형식일때
				{
					off_name=vo.getBuilding_NAME().replace("\"", "").trim();
					detailvo = offdao.officedetailData(off_name,vo.getADDR(),0);
				}
				
			else
			{
				off_name= vo.getBuilding_NAME(); 
				detailvo = offdao.officedetailData(off_name,vo.getADDR(),1);
			}
			
			System.out.println(i+"번:"+off_name);
			//System.out.println("test:" + detailvo.getOFF_FOUND_YEAR());

			detailvo.setADDR(s);
			detailvo.setBuilding_NAME(vo.getBuilding_NAME());

			off_list.add(detailvo);
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			i++;
		}

		JSONArray arr = new JSONArray();
		for (OfficetelVO vo : off_list) {
			JSONObject obj = new JSONObject();
			obj.put("off_name", vo.getBuilding_NAME().replace("\"", "").trim());
			obj.put("off_addr", vo.getADDR());
			obj.put("off_found_year", vo.getFOUND_YEAR());
			obj.put("off_price", vo.getPRICE());
			obj.put("off_area", vo.getAREA());
			
			System.out.println( vo.getBuilding_NAME().replace("\"", "").trim());
			System.out.println(vo.getADDR());
			System.out.println(vo.getFOUND_YEAR());
			System.out.println(vo.getPRICE());
			System.out.println(vo.getAREA());
			arr.add(obj);
		}

		System.out.println(off_list.size());
		model.addAttribute("json", arr.toJSONString()); 
		return "main/test";
		
		
	}
	
}
