package com.sist.mapper;

import org.apache.ibatis.annotations.Select;
import com.sist.vo.*;
import java.util.*;
//SELECT * FROM HIGHINFO_BASIC,HIGHINFO_GRADUATE WHERE HIGHINFO_BASIC.SCHOOLNO='S010000447' AND HIGHINFO_BASIC.SCHOOLNO=HIGHINFO_GRADUATE.SCHOOLNO
public interface Schoolmapper {
	@Select("SELECT * FROM HIGHINFO_GRADUATE WHERE SCHOOLNO='S010000454'")
	public List<highSchool_GraduateVO> schoolAllData();
	
	@Select("SELECT * FROM HIGHINFO_SEOULUNIV WHERE SCHOOLNO='S010000454'")
	public List<highSchool_SeoulVO> seoulAllData();
	
	@Select("SELECT * FROM HIGHINFO_GRADUATE WHERE SCHOOLNO='S010000454'")
	public highSchool_GraduateVO schoolDetailData();
}
