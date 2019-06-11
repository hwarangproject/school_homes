package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

/*
 * APT_ADDR             VARCHAR2(1500) 
APT_NUMBER           VARCHAR2(100)  
APT_NUMBER_MAIN      VARCHAR2(100)  
APT_NUMBER_SUB       VARCHAR2(100)  
APT_NAME             VARCHAR2(2000) 
APT_AREA             VARCHAR2(2000) 
APT_CONTRACT_YM      VARCHAR2(200)  
APT_CONTRACT_DATE    VARCHAR2(500)  
APT_PRICE            VARCHAR2(200)  
APT_FLOOR            VARCHAR2(200)  
APT_FOUND_YEAR       VARCHAR2(200)  
APT_ROAD_NAME        VARCHAR2(1000) 
NO                   NUMBER        
 */
@Getter
@Setter
public class AptVO {
	private String APT_ADDR;             
	private String APT_NUMBER;        
	private String APT_NUMBER_MAIN;
	private String APT_NUMBER_SUB; 
	private String APT_NAME;
	private String APT_AREA;
	private String APT_CONTRACT_YM; 
	private String APT_CONTRACT_DATE;
	private String APT_PRICE;  
	private String APT_FLOOR; 
	private String APT_FOUND_YEAR; 
	private String APT_ROAD_NAME;
	private int NO;      
}
