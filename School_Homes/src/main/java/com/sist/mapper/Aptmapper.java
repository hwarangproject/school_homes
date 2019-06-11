package com.sist.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.AptVO;

public interface Aptmapper {

	@Select("select * FROM APT_SOLD_PRICE WHERE no = 1")
	public List<AptVO> aptAllData();
	
	@Select("SELECT DISTINCT apt_addr, apt_number_main, apt_number_sub, apt_name FROM apt_sold_price where  apt_addr like '%' || #{addr_name} || '%'")
	public List<AptVO> apttestData(String addr_name);
	
}
