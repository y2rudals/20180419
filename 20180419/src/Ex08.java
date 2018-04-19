
public class Ex08 {

	
	
public int a = 10;
	
	Ex08(int temp){	// class 명이랑 동일하면서 반환값이 없는게 생성자입니다.
		System.out.println("생성자 입니다.");
		a = temp;
	}
		
	public static void main(String[] args) {
		new Ex08(30);	// 메모리상에 올리는거.. 인스턴스.. 객체한다.
	}
}
