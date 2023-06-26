package inheritance;

class Test06 {
	public int num;
	public Test06() { num = 100; }
}

class TestClass06 extends Test06 {
	int num = 7777;
	// 여기 7777이 없으면 부모클래스로 가서 100을 얻어온다.
	// 자식클래스에 있는 변수가 우선시된다.
	public void test() {
		System.out.println(num);
		System.out.println(super.num);
		// 부모네 있는 num을 가져올때 super를 붙이면 된다.
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		t.test();
	}
}
