package day04;

import java.util.Arrays;

public class ArrayMatrix {

	public static void main(String[] args) {
		
		//행렬 - 2차원 배열
		//배열안에 배열이 저장되는 형태
		//int[][] <-2차원배열
		
		int[] kor= {10,20,30};
		int[] math= {40,50,60};
		int[] eng = {70,80,90};
		
		int[][] arr = {kor, math, eng}; //{배열, 배열, 배열}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		//2차원 배열의 사용
		System.out.println(arr[0][0]); //행, 열
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		//2차원 배열을 한번에 생성하고, 초기화
		int[][] arr2= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		//2차원 배열의 값을 한번에 보는 방법
		System.out.println(Arrays.deepToString(arr2));
		
		//2차원 배열의 크기만 지정하는 방법
		int[][] arr3 =new int[3][4]; //new int[행크기][열크기]
		System.out.println(Arrays.deepToString(arr3));
		
		//2차원 배열의 순회(순서대로 접근)
		int  x = 1;		
		for(int i = 0; i<arr3.length; i++) { //행접근
			
			for(int j = 0; j < arr3[i].length; j++) {//열접근
				arr3[i][j] = x++;
			}
		System.out.println(Arrays.deepToString(arr3));	
			
		
		
		
		
		
		
	}
}
}
