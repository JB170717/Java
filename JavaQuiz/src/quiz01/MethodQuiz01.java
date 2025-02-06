package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		String result2 =method2("매개변수 리턴");
		System.out.println(result2);
		System.out.println(method3(1,0,0.5));
		System.out.println(method4(3));
		method5("반복학습",5);
		System.out.println(max(1,9));
		System.out.println(abs(-5));
		char[] arr2= {'a','b','c','e','z'};
		System.out.println(method6(arr2));
		int[] arr5= {1,2,3,5,4}; // 미리 만들어져있는 char배열
		System.out.println(method7(arr5));
		String[] arr7=method8("수빈이","화이팅");
		System.out.println(Arrays.toString(arr7)); 
	}

	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String s) {
		return s;
	}
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	static String method4(int a) {
		if(a%2==0) {
			return "짝수";
		}
		else {
			return "홀수";
		}
	}
	static void method5(String s, int a) {
		String str="";
		for(int i=1;i<=a;i++) {
			str+=s;
		}
		System.out.println(str);
	}
	static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}


	}
	static int abs(int a) {
		if(a>0) {
			return a;
		}else {
			return -a;
		}
	}
	static String method6(char[] arr) {

		String str="";
		for(int i=0; i<arr.length; i++) {
			str+=arr[i];
		}
		return str;
	}
	static int method7(int[] arr) {

		int sum=0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;

	}
	static String[] method8(String a, String b) {
		String[] arr= {a,b};
		return arr;

	}
}
