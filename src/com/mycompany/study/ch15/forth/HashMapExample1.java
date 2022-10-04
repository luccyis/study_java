package com.mycompany.study.ch15.forth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
			//key 값에는 String 많이 사용, Object는 자바에서 최상위클래스. 거의 다됨. 밸류값에 잘 사용
		
		//객체 저장
		map.put("신용권", 85); //맵은 put 으로 (add)
		map.put("동장군", 80);
		map.put("홍길동", 90);
//		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기		
//		System.out.println("\t홍길동 : " + map.get("홍길동"));	//	
//		System.out.println("---------");
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //일종의 casting keySet 함수를 사용해서 Set으로 보냄
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
		  String key = keyIterator.next();
		  Integer value = map.get(key);
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
		Map<String, Integer> map2 = new LinkedHashMap<>(); //내부적으로 스레드세이프를 보장하는 차이만 있음.
		
		map2.put("신용권", 85);
		map2.put("동장군", 80);
		map2.put("홍길동", 90);
		
		Set<String> keySet2 = map2.keySet();
		Iterator<String> keyIterator2 = keySet2.iterator();
		while(keyIterator2.hasNext()) {
		  String key = keyIterator2.next();
		  Integer value = map2.get(key);
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();
		
	}
}
