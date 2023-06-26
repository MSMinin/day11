package day11;

class TestClass03 {
	static TestClass03 t; 
	// 아래 test()가 객체 생성전에 미리 실행되므로 
	// 이 t변수도 객체 생성전에 미리 생성되어야 해당 메소드 안에 있는
	// t를 사용가능하니 이 변수 생성할때에도 static을 붙여야한다.
	private TestClass03(){ // 생성자
		System.out.println("생성자 실행");
	}
	public static TestClass03 getInstance() { 
		// 이렇게 싱글톤을 만들떄 사용하면 메소드 이름을 
		// 주로 getInstance라는 이름으로 생성한다.
		// static이 붙어있으므로 객체를 만들기 전에 미리 실행되어진다.
		// 그러면 아직 변수 t가 안 만들어졌기 때문에 오류가 나온다.
		// 그러므로 위 변수 t에도 static을 붙여주어야 한다.
		System.out.println(t + " : test 실행");
		if(t == null)
			t = new TestClass03();
		// t가 처음에는 null을 가지기 때문에
		// if문을 이용해서 1개의 객체만 생성하도록 만드는 것이다.
		// if문이 없으면 객체를 다 따로따로 만들기 때문에 if문을 추가해야한다.
		return t;
	}
	// 싱글톤 사용법 2.
	// 그러면 이제 외부에서 생성자에 접근하지 못하기 때문에
	// 내부에서 객체를 만들기 위해서 메소드를 생성할 것이다.
	// 근데 이 메소드를 사용하기 위해서는 객체가 생성되어야 한다.
	// 하지만 생성자를 못만드므로 static을 붙여주어야 한다.
}
public class MainClass03 {
	public static void main(String[] args) {
		// TestClass03 t01 = new TestClass03();
		// 싱글톤 사용법 1.
		// 생성자에서 private 키워드를 사용하면 new연산자는 사용하지 못한다.
		// 이 뜻은 사용자가 직접적으로 객체를 생성하지 말라는 뜻이다.
		
		// 싱글톤 사용법 3.
		// static을 사용해서 객체를 생성한다.
		TestClass03 t01 = TestClass03.getInstance();
		TestClass03 t02 = TestClass03.getInstance();
		TestClass03 t03 = TestClass03.getInstance();
		System.out.println(t01);
		System.out.println(t02);
		System.out.println(t03);
	}
}
