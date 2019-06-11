package com.sist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.AptVO;
import com.sist.vo.OfficetelVO;

public interface Officemapper {

	@Select("SELECT DISTINCT off_addr, off_number_main, off_number_sub, off_name FROM officetel where off_addr like '%' || #{addr_name} || '%'")
	public List<OfficetelVO> officetestData(String addr_name);
}
