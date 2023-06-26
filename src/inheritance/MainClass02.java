package inheritance;

class Calc02{
	public void display() {
		System.out.println("나는 계산기");
	}
}

class Computer02 extends Calc02{
	Calc02 c;
	public Computer02() {c = new Calc02();}
	public void print02() {
		System.out.println("print");
		display(); // 상속받아 부모클래스에 있는 메소드 바로 사용가능
		// 원래 display라는 기능이 없어서 부모클래스를 탐색하여 찾아본다.
	}
	public void print() {
		System.out.println("나는 컴퓨터");
		c.display();
	}
}

public class MainClass02 {
	public static void main(String[] args) {
//		Calc02 c = new Calc02();
//		c.display();
		Computer02 c = new Computer02();
		c.print();
		c.print02();
	}
}
