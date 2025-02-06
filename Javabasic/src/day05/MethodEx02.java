package day05;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		/*
		 * 호출할때는 이름+(소괄호 a->값은 넣어야지)만 봐라
		 * 
		 * 매개변수
		 * 1. 매서드(함수)를 호출할 때 전달할 매개변수
		 * 2. 없을 수도 있고,여러개일 수도 있습니다.
		 */	
		
		int result= calSum(5);
		System.out.println(result);
		
		int result2= calSum(10);
		System.out.println(result2);
		
		int result3 = calSum2(5,10);
		System.out.println(result3);
	}
	
	
	static int calSum(int a) {
		//a를 여기서 쓸 수 있음~ 마음껏
		int sum =0;
		for(int i=1; i<=a;i++) {
			sum+=i;
		}				
		return sum;
		
	}
	
	static int calSum2(int start, int end) {
		
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		
		return sum;
	}
}
