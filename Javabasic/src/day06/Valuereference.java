package day06;

import java.util.Arrays;

public class Valuereference {

	  
	public static void main(String[] args) {
		
		//call by value vs  call by reference
		int a=1;
		value(2); //기본타입 변수는 값을 복사해서 전달시킴			
		System.out.println(a);
		
		System.out.println("--------------------------");
		int[] arr= new int[]{1,2,3};
		reference(arr); //주소값을 넘김
		System.out.println(Arrays.toString(arr));
	}
	
	
	//call by value
	static void value(int a) {
		  a=1000;
	}
	
	static void reference(int[] arr) { //주소값
		
		arr[0]=1000;
		arr[1]=900;
		arr[2]=800;
		
	}
	
	
	
}
