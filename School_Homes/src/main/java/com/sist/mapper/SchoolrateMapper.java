package com.sist.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.*;
public interface SchoolrateMapper {
	
	// ���з� ����
	@Select("SELECT * FROM highinfo_graduate ORDER BY graduate_total DESC")
	public List<SchoolrateVO> SchoolrateAllData();
	
	// �б� �ּ� ��������
	@Select("SELECT * FROM highinfo_basic WHERE schoolno = #{schoolno}")
	public BasicVO schoolbasic_info(String schoolno);
}
