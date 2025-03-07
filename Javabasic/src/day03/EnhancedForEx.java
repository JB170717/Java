package day03;

public class EnhancedForEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};		
		//일반반복문
//		for(int i =0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		//향상된 for문
		for(int a :arr) {
			System.out.println(a);
		}
		
		System.out.println("------------");
		
		String[] arr2 = {"월", "화","수", "목", "금", "토","일"};
		for(String a:arr2) {
			System.out.println(a);
		}
		
		System.out.println("------------");
		
		int sum = 0;
	
		int[] point = {34, 56, 12, 99, 98}; //배열 요소의 합계와 평균
		for(int a:point) {
			sum+=a;	
			
			
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+(double)sum/point.length); // 실수로 캐스팅한다
	}

}
