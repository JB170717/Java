package quiz01;

import java.util.Arrays;

public class Quiz22 {

	public static void main(String[] args) {
		
		//배열의 크기를 한개 늘리고, 값을 복사하고, 맨 앞에 data를 추가해세요
		int[] arr= {10,20,30,40,50};		
		int data =100; //추가할 데이터
		
		int[] arr2= new int[arr.length+1];
		
		for(int i=0;i<arr2.length-1;i++) {
			arr2[i+1]=arr[i];
		}
		arr2[0]=data;
		
		arr= arr2;
		arr2=null;
		System.out.println(Arrays.toString(arr));
			
		
	}
}
