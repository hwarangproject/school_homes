package com.sist.vo;

import lombok.Getter;
import lombok.Setter;
/*
 * ADDR             VARCHAR2(1000) 
NUMBER1          VARCHAR2(100)  
NUMBER_MAIN      VARCHAR2(100)  
NUMBER_SUB       VARCHAR2(100)  
BUILDING_NAME    VARCHAR2(1000) 
CONTRACT_DATE    VARCHAR2(100)  
FOUND_YEAR       VARCHAR2(100)  
ROAD_NAME        VARCHAR2(1000) 
BUILD_NO         NUMBER         
AREA             NUMBER         
PRICE            NUMBER         
CONTRACT_YM      NUMBER         
FLOOR            NUMBEr
 */
@Setter
@Getter
public class RecommandVO {
	private String ADDR;             
	private String NUMBER;        
	private String NUMBER_MAIN;
	private String NUMBER_SUB; 
	private String BUILDING_NAME;
	private int AREA;
	private int CONTRACT_YM; 
	private String CONTRACT_DATE;
	private int PRICE;  
	private int FLOOR; 
	private String FOUND_YEAR; 
	private String ROAD_NAME;
	private int BUILDING_NO;
}
