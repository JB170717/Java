package quiz17;

public class StringQuix02 {
	
	public static void main(String[] args) {
		
		/*
		 * 문자열 거꾸로 뒤집기
		 * 
		 * 매개변수로 전달받은 문자열을, 거꾸로 뒤집어서 반환하는 메서드
		 * 
		 * 
		 * reverse(String)
		 * 입력 -> abcde
		 * 반환 -> edcba
		 * 
		 * 
		 * 
		 */
		
		System.out.println(reverse("가나다라마바사아자타카"));
		
	}
	
	public static String reverse(String word) {
		
//		String str ="";
//		char[] arr=word.toCharArray();
//		char[] arr2=new char[arr.length];
//		for(int i=0; i<arr.length;i++) {
//			arr2[arr.length-i-1]=arr[i];
//		}				
//		
//		for(int i=0; i<arr.length;i++) {
//			str+=arr2[i];
//		}
//		return str;
		
		//쌤답변
		
		String str = "";
		for(int i= word.length()-1; i>=0 ;i--) {
			str+=word.charAt(i);
		
		}
		return str;
		
		
	}
	

}
