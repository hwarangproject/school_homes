package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.mapper.RecommandMapper;

@Repository
public class RecommandDAO {
	@Autowired
	private RecommandMapper mapper;

}
