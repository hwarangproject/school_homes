package com.sist.vo;

import lombok.Getter;
import lombok.Setter;


/*
 * SIDOEDU                   VARCHAR2(500)  
LOCALEDU                  VARCHAR2(500)  
LLOCAL                    VARCHAR2(2000) 
SCHOOLNO         NOT NULL VARCHAR2(100)  
SCHOOLNAME                VARCHAR2(1000) 
SCHOOLCODE                VARCHAR2(100)  
SCHOOLTYPE                VARCHAR2(100)  
HIGHTYPE                  VARCHAR2(500)  
BRANCH                    VARCHAR2(100)  
ATTACHED                  VARCHAR2(100)  
DAYANDNIGHT               VARCHAR2(100)  
ANNIVERSARY               VARCHAR2(1000) 
FOUNDATION                VARCHAR2(1000) 
DONGCODE                  VARCHAR2(1000) 
ADDR                      VARCHAR2(2000) 
ADDR_DETAIL               VARCHAR2(2000) 
ZIPCODE                   VARCHAR2(1000) 
ZIPCODE_ROAD              VARCHAR2(1000) 
ADDR_ROAD                 VARCHAR2(2000) 
ADDR_ROAD_DETAIL          VARCHAR2(2000) 
LATITUDE                  VARCHAR2(1000) 
LONGITUDE                 VARCHAR2(1000) 
TEL                       VARCHAR2(100)  
FAX                       VARCHAR2(100)  
HOMEPAGE                  VARCHAR2(1000) 
COEDUCATION               VARCHAR2(100)  
 * 
 */
@Getter
@Setter
public class highSchool_BasicVO {

	private String SIDOEDU;                  
	private String LOCALEDU;                
	private String LLOCAL;                  
	private String SCHOOLNO;         
	private String SCHOOLNAME;             
	private String SCHOOLCODE;            
	private String SCHOOLTYPE;               
	private String HIGHTYPE;               
	private String BRANCH;                   
	private String ATTACHED;                   
	private String DAYANDNIGHT;                
	private String ANNIVERSARY;              
	private String FOUNDATION;               
	private String DONGCODE;                   
	private String ADDR;                     
	private String ADDR_DETAIL;                
	private String ZIPCODE;                   
	private String ADDR_ROAD;                
	private String ADDR_ROAD_DETAIL;       
	private String LATITUDE;                   
	private String LONGITUDE;                  
	private String TEL;                      
	private String FAX;                        
	private String HOMEPAGE; 
	private String COEDUCATION;             
}
