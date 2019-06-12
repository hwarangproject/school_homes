package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.Aptmapper;
import com.sist.mapper.Officemapper;
import com.sist.vo.*;

@Repository
public class OfficeDAO {

   @Autowired
   private Officemapper officemapper;

   public List<OfficetelVO> OfficetestData(String addr_name) {
      return officemapper.officetestData(addr_name);
   }

   public OfficetelVO officedetailData(String off_name, int index) {

      if (index == 0) 
         return officemapper.officedetailData2(off_name);
       else
          return officemapper.officedetailData(off_name);
      
   }
}