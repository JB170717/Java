package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 첫째줄에 N정수가 주어집니다.
		 * 2. 이후부터는 N줄에 걸쳐서 정수를 입력받습니다.
		 * 이 입력받은 값을, 배열에 순서대로 저장.
		 * int[] arr= new int[크기]
		 */
		
		Scanner scan= new Scanner(System.in);
		int size = scan.nextInt();		
		int i = 0;
		int[] arr= new int[size];
		
		while(i<size) {					
			int num = scan.nextInt();
			arr[i]=num;			
			i++;		
		}
		System.out.println(Arrays.toString(arr));
		
		
				
			
		
		
		
	}
	
	
	
	

}
