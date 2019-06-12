package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

/*
 * OFF_ADDR             VARCHAR2(1000) 
OFF_NUMBER           VARCHAR2(100)  
OFF_NUMBER_MAIN      VARCHAR2(100)  
OFF_NUMBER_SUB       VARCHAR2(100)  
OFF_NAME             VARCHAR2(500)  
OFF_CONTRACT_DATE    VARCHAR2(100)  
OFF_FOUND_YEAR       VARCHAR2(100)  
OFF_ROAD_NAME        VARCHAR2(100)  
OFF_PRICE            NUMBER         
OFF_CONTRACT_YM      NUMBER         
OFF_AREA             NUMBER         
OFF_NO               NUMBER         
OFF_FLOOR            NUMBER   
 */

@Getter
@Setter
public class OfficetelVO {
/*
 * ADDR, NUMBER1, NUMBER_MAIN, NUMBER_SUB, BUILDING_NAME, CONTRACT_DATE, FOUND_YEAR, ROAD_NAME, PRICE, CONTRACT_YM, AREA, BUILD_NO, FLOOR
 */
	private String ADDR;
	private String NUMBER;
	private String NUMBER_MAIN;
	private String OF_NUMBER_SUB;
	private String OFF_NAME;
	private String OFF_CONTRACT_DATE;
	private String OFF_FOUND_YEAR; 
	private String OFF_ROAD_NAME;  
	private int OFF_PRICE; 
	private int OFF_CONTRACT_YM;     
	private int OFF_AREA;        
	private int OFF_NO;        
	private int OFF_FLOOR;   
}
