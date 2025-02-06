package day05;

import java.util.Arrays;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		//배열을 (매개변수)로 전달할 수 있을까? yes
		int[] 배열= {1,2,3,4,5};
		inputArray( 배열 ); //배열의 변수명으로 주면됨.
						
		//배열을 반환하는 메서드
//		배열타입 변수명 = returnArray();
		int[] 변수명 = returnArray();
		System.out.println(Arrays.toString(변수명));
	}
	
	//배열을 매개변수로 받는 매서드 모형
	static void inputArray(int[] arr) {
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	//배열을 반환하는 메서드 모형// return이 배열임 -> 반환유형에 배열형식을 써라.
	static int[] returnArray() {
		
		//어떻게든 배열을 만들어서, 변수명으로 리턴하면 됨~
		int[] arr =new int[3];
		arr[0] = 13;
		arr[1] = 23;
		arr[2] = 33;
		
		return arr;
		
	}
}
