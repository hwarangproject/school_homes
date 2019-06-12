package com.sist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.OfficetelVO;

public interface Officemapper {
   //오피스텔 
   @Select("SELECT DISTINCT addr, number_main, number_sub, building_name FROM officetel where addr like '%' || #{addr_name} || '%'")
   public List<OfficetelVO> officetestData(String addr_name);
   
   @Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG( area),1) as  area from officetel where  building_name = #{ building_name}")
   public OfficetelVO officedetailData(String  name);
   
   @Select("SELECT ROUND(AVG( found_year)) as  found_year, ROUND(AVG( price)) as  price, ROUND(AVG( area),1) as  area from officetel where  building_name like '%' || #{ building_name} || '%'")
   public OfficetelVO officedetailData2(String  name);
   
   @Select("SELECT DISTINCT * FROM officetel where  addr like '%' || #{addr_name} || '%'")
   public List<OfficetelVO> officeAnalysisData(String addr_name);
}