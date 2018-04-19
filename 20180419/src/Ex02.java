import javax.swing.JOptionPane;

public class Ex02 {

	public static boolean isNumber(String str){
		boolean rtnValue = true;
		for(int i = 0; i < str.length(); i++){
			str.charAt(i); // 1,2,3,4,5,6,7,8,9 같으면 넘어가 아니면 false
	if(	!( str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || 
		str.charAt(i)=='3' ||
		str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' ||
		str.charAt(i)=='7' || str.charAt(i)=='8' || str.charAt(i)=='9' )
		)
			return false;
//			System.out.println("str.charAt("+i+")"+str.charAt(i));
		}
		return rtnValue;
	}
	
	
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("입력하세요");
		System.out.println("입력받은 문자는 숫자입니다 " + isNumber(str));
		
		
	}
}
