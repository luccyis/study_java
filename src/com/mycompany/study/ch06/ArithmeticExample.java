package com.mycompany.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		
		Arithmetic arithmetic = new Arithmetic();
		
		int resultAdd = arithmetic.plus(1, 2);
		int resultMinus = arithmetic.minus(1, 2);
		int resultMulti = arithmetic.multiplication(1, 2);
		int resultDivid = arithmetic.division(1, 2);
		int resultRemind = arithmetic.remind(1, 2);
		
		arithmetic.say(resultAdd);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMulti);
		arithmetic.say(resultDivid);
		arithmetic.say(resultRemind);

		
		arithmetic.what("이렇게 하는거 ", "맞나?");
	}

}
