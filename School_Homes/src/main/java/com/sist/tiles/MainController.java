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



}
