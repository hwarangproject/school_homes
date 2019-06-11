package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.Aptmapper;
import com.sist.vo.AptVO;


@Repository
public class AptDAO {
	
	@Autowired
	private Aptmapper aptmapper;

	public List<AptVO> aptAllData()
	{
		   return aptmapper.aptAllData();
	}
	
	public List<AptVO> apttestData(String addr_name)
	{
		return aptmapper.apttestData(addr_name);
	}
}
