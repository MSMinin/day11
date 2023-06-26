package inheritance;
// 이번에는 상속을 받으면 어떻게 진행이 되는지 순서를 살펴본다.

class Test03{
	public Test03() {
		System.out.println("부모 생성자 실행");
	}
}

class TestClass03 extends Test03 {
	public TestClass03() {
		System.out.println("자식 생성자 실행");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		// 객체를 생성하는데 먼저 부모클래스먼저확인하고 그 다음에
		// 생성되는 자식클래스 순서대로 진행된다.
	}
}
