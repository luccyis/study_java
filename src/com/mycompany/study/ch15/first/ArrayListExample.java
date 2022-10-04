package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
			
			list.add("Java");
			list.add("JDBC");
			list.add("Servlet/JSP");
			list.add(2, "Database");  //인덱스 지정 가능
			list.add("iBATIS");

			int size = list.size();   //리스트안에 객체 수  size
			System.out.println("총 객체수: " + size);		
			System.out.println();
			
			String skill = list.get(2); //인덱스 번호에 데이터 가져옴 get
			System.out.println("2: " + skill);
			System.out.println();

			for(int i=0; i<list.size(); i++) {
				String str = list.get(i);   //get(인덱스값)
				System.out.println(i + ":" + str);
			}
			
			System.out.println();
					
			list.remove(2);  //데이터 당겨짐
			list.remove(2);
			list.remove("iBATIS");		
			
			for(int i=0; i<list.size(); i++) {
				String str = list.get(i);
				System.out.println(i + ":" + str);
			}
			
		
		}
	

}
