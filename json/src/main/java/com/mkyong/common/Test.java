package com.mkyong.common;

public class Test {
	@org.junit.Test
	public void test(){
		int a = 0 ;
		System.out.println(a);
		System.out.println("1");
		m1();
		m2();
	}
	
	public void m1(){
		System.out.println("m1");
	}
	public void m2(){
		System.out.println("m2");
	}
}
