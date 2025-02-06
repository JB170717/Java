package quiz04;

public class MainClass {
	
	
	public static void main(String[] args) {
		/*
		1번 과제
		Arrays.toString()와 똑같은 기능 구현하기
				1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
				2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
				2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
		*/
		

		int[] my1 = {1,2,3,4,5};	
		char[] my2 = {'a','b','c'};
		String[] my3 = {"오늘은 스터디를 만들었다"};
	
//		ArrayPrint ap =new ArrayPrint();
//		System.out.println(ap.toArray(my1));
//		System.out.println(ap.toArray(my2));
//		System.out.println(ap.toArray(my3)); 
		System.out.println(ArrayPrint.toArray(my1));
		System.out.println(ArrayPrint.toArray(my2));
		System.out.println(ArrayPrint.toArray(my3));
		

		
		
		}
	
}
