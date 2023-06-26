package com.care.test;

import java.util.Date;

public class MainClass03 {
	public static void main(String[] args) {
		//sql과 util에서의 Date의 차이
		com.java.sql.Date date = new com.java.sql.Date();
		date.myDate();
		
		com.java.util.Date d = new com.java.util.Date();
		// 위에서 sql에 있는 Date를 가져오고
		// util에 있는 Date를 가져오려 하면 이렇게 표현이 된다.
		// 위 Date와 헷갈리기 때문이다.
		
		Date dd;
		java.sql.Date ddd;
	}
}
