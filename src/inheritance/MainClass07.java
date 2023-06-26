package inheritance;

class Test07 {
	protected int num;
	public void test() { 
		System.out.println("부모 test"); 
	}
}

class TestClass07 extends Test07{
	public void display() {
		num = 100;
		System.out.println("display 실행");
		super.test();
	}
	public void test() {
		System.out.println("자식 test");
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.display();
	}
}
