package quiz01;

import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		int[] arr= new int [N];
		
		int max=0;
		int min=0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			if(i==0) {// 초기에 한번만
				max=arr[i];
				min=arr[i];
			}
			
			if(max<=arr[i]) { //최대값
				max=arr[i];
			}
			
			if(min>=arr[i]) { //최소값
				min=arr[i];
			}
		}		
		System.out.print(min+" "+max);
	
		
	}

}
