package com.sist.tiles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.SeoulunivDAO;
import com.sist.vo.BasicVO;
import com.sist.vo.SeoulunivVO;

@Controller
public class SeoulunivController {
	@Autowired
	private SeoulunivDAO sudao;
	
	@RequestMapping("main/seouluniv.do")
	public String main_seouluniv(Model model){
		List<SeoulunivVO> list=sudao.SeoulunivAllData();
		List<BasicVO> blist=new ArrayList<BasicVO>();
		int count=0;
		
		for(int i=0; i<100; i++){
			BasicVO vo=sudao.schoolbasic_info(list.get(i).getSchoolno());
			count=sudao.schoolbasic_count(list.get(i).getSchoolno());
			
			if(count!=0){
				blist.add(vo);
			}
		
		}
		model.addAttribute("blist", blist);
		model.addAttribute("list", list);
		
		return "main/seouluniv";
	}
}
