package com.sist.mapper;

import org.apache.ibatis.annotations.Select;
import com.sist.vo.RecommandVO;
import java.util.*;

public interface RecommandMapper {
	@Select("SELECT DISTINCT addr FROM apartment WHERE addr LIKE '%'||'동'||'%'")
	public ArrayList<String> getDongList();

	@Select("SELECT * FROM apartment WHERE addr LIKE '%'||#{addr}||'%' AND price = #{price} AND area = #{area}")
	public List<RecommandVO> RecommandList(RecommandVO vo);
}
