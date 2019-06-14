package com.sist.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.OfficetelVO;

public interface Officemapper {

	// 오피스텔s
	/*
	 * @Select("SELECT DISTINCT off_addr, off_number_main, off_number_sub, off_name FROM officetel where off_addr like '%' || #{addr_name} || '%'"
	 * ) public List<OfficetelVO> officetestData(String addr_name);
	 * 
	 * @Select("SELECT ROUND(AVG(off_found_year)) as off_found_year, ROUND(AVG(off_price)) as off_price, ROUND(AVG(off_area),1) as off_area from officetel where off_name = #{off_name}"
	 * ) public OfficetelVO officedetailData(String off_name);
	 * 
	 * @Select("SELECT ROUND(AVG(off_found_year)) as off_found_year, ROUND(AVG(off_price)) as off_price, ROUND(AVG(off_area),1) as off_area from officetel where off_name like '%' || #{off_name} || '%'"
	 * ) public OfficetelVO officedetailData2(String off_name);
	 */
	/*// 오피스텔
	@Select("SELECT DISTINCT addr, number_main, number_sub, building_name FROM officetel where addr like '%' || #{addr} || '%'")
	public List<OfficetelVO> officetestData(String addr);

	@Select("SELECT count(*) from officetel where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
	public int officedetailCountData(Map map);
	
	@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from officetel where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
	public OfficetelVO officedetailData(Map map);

	@Select("SELECT count(*) from officetel where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
	public int officedetailCountData2(Map map);

	@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from officetel where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
	public OfficetelVO officedetailData2(Map map);

	// 아파트
	@Select("SELECT DISTINCT addr, number_main, number_sub, building_name FROM APARTMENT where addr like '%' || #{addr} || '%'")
	public List<OfficetelVO> apttestData(String addr);

	@Select("SELECT count(*) from APARTMENT where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
	public int aptdetailCountData(Map map);

	@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from APARTMENT where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
	public OfficetelVO aptdetailData(Map map);

	@Select("SELECT count(*) from APARTMENT where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
	public int aptdetailCountData2(Map map);

	@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from APARTMENT where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
	public OfficetelVO aptdetailData2(Map map);*/

	// 주택
	/*@Select("SELECT DISTINCT addr, number_main, number_sub, building_name FROM town where addr like '%' || #{addr} || '%'")
	public List<OfficetelVO> towntestData(String addr);

	@Select("SELECT count(*) from town where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
	public int towndetailCountData(Map map);

	@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from town where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
	public OfficetelVO towndetailData(Map map);

	@Select("SELECT count(*) from town where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
	public int towndetailCountData2(Map map);

	@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from town where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
	public OfficetelVO towndetailData2(Map map);
*/
	
	
	
	
	
	
	
	//3월 아파트
	// 오피스텔
		@Select("SELECT DISTINCT addr, number_main, number_sub, building_name FROM officetel where addr like '%' || #{addr} || '%'")
		public List<OfficetelVO> officetestData(String addr);

		@Select("SELECT count(*) from officetel where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
		public int officedetailCountData(Map map);
		
		@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from officetel where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
		public OfficetelVO officedetailData(Map map);

		@Select("SELECT count(*) from officetel where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
		public int officedetailCountData2(Map map);

		@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from officetel where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
		public OfficetelVO officedetailData2(Map map);

		// 아파트
		@Select("SELECT DISTINCT addr, number_main, number_sub, building_name FROM apartment_search where addr like '%' || #{addr} || '%'")
		public List<OfficetelVO> apttestData(String addr);

		@Select("SELECT count(*) from apartment_search where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
		public int aptdetailCountData(Map map);

		@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from apartment_search_search where building_name = #{building_name} AND addr like '%' || #{addr} || '%'")
		public OfficetelVO aptdetailData(Map map);

		@Select("SELECT count(*) from apartment_search_search where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
		public int aptdetailCountData2(Map map);

		@Select("SELECT ROUND(AVG(found_year)) as found_year, ROUND(AVG(price)) as price, ROUND(AVG(area),1) as area from apartment_search_search where building_name like '%' || #{building_name} || '%' AND addr like '%' || #{addr} || '%'")
		public OfficetelVO aptdetailData2(Map map);
}
