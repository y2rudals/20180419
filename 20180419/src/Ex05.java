
public class Ex05 {
	public static int a = 10;
	public int b = 20; 
	
	public void doC(){
		System.out.println("doC is not static");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Ex05.a);
		doA();
		doB();
		Ex05.doA();
		Ex05.doB();
	}
	
	public static void doA(){
		System.out.println("do A");
	}
	
	public static void doB(){
		System.out.println("do B");
	}
}
