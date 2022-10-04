package com.mycompany.study.ch12.first;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {} //500밀리세컨만큼 잠깐 멈춤 (sleep) 
		}

		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		//단일 thread : 소리가 나고 글자가 나온다. 
	}

}
