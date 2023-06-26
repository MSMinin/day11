package com.care.test;

public class TestClass01 {
	public void test() {
		System.out.println("test1");
	}
	void test2() { 
	// public을 지우면 default로 적용된다.
	// default는 같은 패키지에 있으면 외부에서 호출이 가능하다. 
		System.out.println("test2");
	}
}
