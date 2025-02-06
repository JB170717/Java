package day05;

public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * 1. 함수는 만들고, 사용하는 과정이 있습니다 -> 함수의 호출 //호출해주는 곳에서는 값
		 * 2. 매서드 안에서는 매서드를 선언할 수 없습니다.(함수안에 함수)
		 */	
		
		//멋진 기능을 하나 만들어야지~ 1부터 10까지 합계						
		int num = sumNum();
		System.out.println(num);
		
		System.out.println( sumNum() ); 
		
		//문자열을 반환하는 함수~		
		String result = randomStr();
		System.out.println(result);
	}
	
	//함수
	static int sumNum() {
		int sum =0;
		for(int i =1; i<=10; i++) {
			sum+=i;
		}
		return sum;	//sumNum으로 되돌려준다~	
	}
	
	//함수
	static String randomStr() {
		
		String str ="";
		for(char c ='A'; c<='Z';c++) {
			str+=c;
		}
		
		return str; // 숫자같은경우는 return 0
	}
	
	
}
