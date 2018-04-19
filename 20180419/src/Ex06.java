
public class Ex06 {
	public static void main(String[] args) {
		
		/*
		 * static 은... 바로 호출가능
		 * non-static 은 new 라는 예약어를 통해서 호출 가능.
		 */
		
		System.out.println(Ex05.a);
		Ex05.doA();
		Ex05.doB();
		
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.b);
		ex05.doC();
		
	}
}
