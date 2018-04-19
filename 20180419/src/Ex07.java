
public class Ex07 {

	/*
	 * ocjp 자격증 
	 * 메서드 오버로딩 overloading 
	 * 
	 * javascript Arguments.length <= 매개변수 if else 매개변수..
	 */
	public static void doA(){
		System.out.println("doA");
	}
	public static void doA(int a){
		System.out.println("doA int a");
	}
	public static void doA(int a, int b){
		System.out.println("doA int a, int b");
	}
	public static void main(String[] args) {
		doA();
		doA(10);
		doA(10,20);
	}
	
	
}
