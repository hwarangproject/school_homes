package com.sist.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.*;

public interface SeoulunivMapper {
	// ����� �԰� ����
	@Select("SELECT * FROM highinfo_seouluniv ORDER BY school_rank")
	public List<SeoulunivVO> SeoulunivAllData();
	
	// �� �� ó��
	@Select("SELECT count(*) FROM highinfo_basic WHERE schoolno=#{schoolno}")
	public int schoolbasic_count(String schoolno);
	
	// �б� �ּ� ��������
	@Select("SELECT * FROM highinfo_basic WHERE schoolno=#{schoolno}")
	public BasicVO schoolbasic_info(String schoolno);
}
