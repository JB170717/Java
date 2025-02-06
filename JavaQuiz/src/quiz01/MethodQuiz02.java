package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
		
		String str = java(5);
		System.out.println(str);
		
		String str1 = java(9);
		System.out.println(str1);
		
		System.out.println(java(0));
		
	}
	
	static String java(int n) {
		
		String str = "";		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				str+="바";
			}else {
				str+="자";
			}
		}
		return str;
		
		
		
		
		
	}
	
	
	
	
}
