package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		
		//백준 2차원 배열 -2566번		
		Scanner scan= new Scanner(System.in);		
		int[][] arr=new int[9][9];				
		int x=0;
		int y=0;
		//값을 저장하기
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= scan.nextInt();
				
				//최대
				if(max<arr[i][j]) {
					max=arr[i][j];
					 x=i;
					 y=j;
				}				
			}
			
		}
		System.out.println(max);
		System.out.print((x+1)+" "+(y+1));
	
	}

}
