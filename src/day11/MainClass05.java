package day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass05 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat simple = 
			new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		// 내가 원하는 형식으로 바꿀수도 있다.
		String date = simple.format(time);
		// 바뀐 형식을 String으로 저장하고 출력한다.
		System.out.println(date);
		
		System.out.println("===============================");
		Date d = new Date();
		// Date는 util과 sql 2가지가 있는데 sql은 나중에 DB할때 사용한다.
		// 자바에서는 util사용한다.
		System.out.println(d);
		date = simple.format(d);
		System.out.println(date);
		
	}
}
