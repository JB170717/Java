package quiz01;

import java.util.Scanner;

public class Quiz19 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int N= scan.nextInt(); // 입력받을 데이터 개수
	int X= scan.nextInt(); // 보다 작은 수를 찾음
		
	int[] arr=new int[N];
	
	for(int i=0; i<arr.length; i++) {
		arr[i]= scan.nextInt();	
		
		if(arr[i]<X) {
			System.out.print(arr[i]+" ");
		}
	}		
		
	}

}
