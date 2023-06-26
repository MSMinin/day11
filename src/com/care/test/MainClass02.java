package com.care.test;

import java.util.*;
// 아래와 같은 경우로 ArrayList도 java.util 안에 있으므로
// * 로 표시하면 그 패키지에 있는 모든 값을 사용한다는 뜻이다.

// import com.java.util.Test01;
// import com.java.util.Test02;
import com.java.util.*;
// 해당하는 패키지에 있는 모든 클래스를 받아온다는 뜻
public class MainClass02 {
	public static void main(String[] args) {
		ArrayList arr;
		Test01 t = new Test01();
		t.test();
		
		Test02 t02 = new Test02();
		
	}
}
