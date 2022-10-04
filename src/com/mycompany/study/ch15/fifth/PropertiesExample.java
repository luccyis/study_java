package com.mycompany.study.ch15.fifth;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		
		//생성자
		Properties properties  = new Properties(); //인터페이스 형태를 띄지않음.
		
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8"); //객체 (첫글자 대문자).함수 (static으로 선언돼있음)
		
//		FileReader fileReader = new FileReader(path); 
//		properties.load(fileReader);
		
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password"); 
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
