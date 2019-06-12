package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

/*
 *  ADDR             VARCHAR2(1000) 
 NUMBER           VARCHAR2(100)  
 NUMBER_MAIN      VARCHAR2(100)  
 NUMBER_SUB       VARCHAR2(100)  
 NAME             VARCHAR2(500)  
 CONTRACT_DATE    VARCHAR2(100)  
 FOUND_YEAR       VARCHAR2(100)  
 ROAD_NAME        VARCHAR2(100)  
 PRICE            NUMBER         
 CONTRACT_YM      NUMBER         
 AREA             NUMBER         
 NO               NUMBER         
 FLOOR            NUMBER   
 */

@Getter
@Setter
public class OfficetelVO {
/*
 * ADDR, NUMBER1, NUMBER_MAIN, NUMBER_SUB, BUILDING_NAME, CONTRACT_DATE, FOUND_YEAR, ROAD_NAME, PRICE, CONTRACT_YM, AREA, BUILD_NO, FLOOR
 */
	private String ADDR;
	private String NUMBER1;
	private String NUMBER_MAIN;
	private String NUMBER_SUB;
	private String NAME;
	private String BUILDING_NAME;
	private String FOUND_YEAR; 
	private String ROAD_NAME;  
	private int  PRICE; 
	private int  CONTRACT_YM;     
	private int  AREA;        
	private int  NO;        
	private int  FLOOR;   
}
