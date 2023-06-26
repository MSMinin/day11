package day11;

public class MainClass04 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		// 현재시간을 얻어오는데 초단위로 표현해준다.
		// long타입을 사용해야한다.
		System.out.println(time);
		
		try {
			Thread.sleep(2000);
			// 대기하는 메소드인데 2초 대기하라는 뜻이다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}// 아직 배우지 않았지만, 예외처리(try-catch)라는 것을 사용해야 한다.
		
		System.out.println("출력");
		// 이러면 위 시간이 나온다음 2초 지나고 "출력"문장이 출력된다.
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println((end - time)/1000 + "초 사용");
		
		// 결과물은 아래처럼 출력된다.
		// 시작시간
		// 출력
		// 종료시간
		// 시작부터 종료까지 걸린 시간
		
	}
}
