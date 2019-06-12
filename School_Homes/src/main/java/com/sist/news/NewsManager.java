package com.sist.news;

import org.springframework.stereotype.Service;
/*
 *     수요일 ==> 상세보기 (통계) => Trigger
 *     목요일 ==> webSocket => Index
 *     금요일 ==> 프로젝트 마무리 => Spring 총정리 
 *     
 *     월 => React (webstorm)
 *     화 => Node => mongodb
 *     수 => Node <=> React (Router)
 *     목 => front => 간단한 사이트
 *     금 
 *     월 =>
 *     화 => 배포 => webpack 
 *     수 => 정리 => 수료 
 */
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.net.*;
@Service
public class NewsManager {
    public List<Item> newsAllData(String data)
    {
    	List<Item> list=new ArrayList<Item>();
    	try
    	{
    		// 파싱 (XML,JSON=>데이터를 추출)
    		JAXBContext jc=JAXBContext.newInstance(Rss.class);
    		URL url=new URL("http://newssearch.naver.com/search.naver?where=rss&query="
    				       +URLEncoder.encode(data, "UTF-8"));
    		Unmarshaller un=jc.createUnmarshaller();
    		/*
    		 *   Unmarshaller : XML => java클래스
    		 *   Marshaller : java클래스 => XML
    		 */
    		Rss rss=(Rss)un.unmarshal(url);
    		list=rss.getChannel().getItem();
    	}catch(Exception ex){}
    	return list;
    }
}













