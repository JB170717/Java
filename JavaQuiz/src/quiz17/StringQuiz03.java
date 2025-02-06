package quiz17;

import java.util.Scanner;

public class StringQuiz03 {
	
	public static void main(String[] args) {
		/*
		 * 알파벳 소문자로만 이루어진 단어가 주어진다. 
		 * 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 함수를 작성하시오.
			팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 			
			level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.			
			boolean palindrom(String word) : 팰린드롬이면 true, 아니면 false을 반환한다..
		 */
		
		System.out.println(palindrom("noon"));
	}
	
	public static boolean palindrom(String word) {
		
//		for(int i =0; i<word.length()/2; i++) {
//			if((word.charAt(i)!=word.charAt(word.length()-i-1))){
//				return false;
//			}
//		}
//		return true;
		
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();
		
		String newWord =sb.toString();
		
		return word.equals(newWord);
	
		
	}
		
		
	
	


}
