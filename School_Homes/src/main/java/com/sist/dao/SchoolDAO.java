package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sist.mapper.Schoolmapper;
import com.sist.vo.*;

@Repository
public class SchoolDAO {
	@Autowired
	private Schoolmapper schoolmapper;
	
	public List<highSchool_GraduateVO> schoolAllData()
	{
		return schoolmapper.schoolAllData();
	}
	
	public List<highSchool_SeoulVO> seoulAllData()
	{
		return schoolmapper.seoulAllData();
	}
	
	public highSchool_GraduateVO schoolDetailData()
	{
		return schoolmapper.schoolDetailData();
	}
	
}
