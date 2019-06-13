package com.sist.mapper;

import org.apache.ibatis.annotations.Select;
import java.util.*;

public interface RecommandMapper {
	@Select("SELECT DISTINCT addr FROM apartment WHERE addr LIKE '%'||'동'||'%'")
	public ArrayList<String> getDongList();
}
