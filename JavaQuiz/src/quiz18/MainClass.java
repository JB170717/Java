package quiz18;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		/*		
		 * 띄어쓰기 기준으로 데이터 입력이 들어올 때,
		 * 정수배열에 저장하기
		 * 		
		 * 54 32 43 54 75
		 * 
		 * nextLine()받아서, split()쪼개고, parseInt로 변환해서 정수 배열에 저장 
		 * 
		 */
		
		Scanner scan =new Scanner(System.in);

		String str =scan.nextLine();
		String[] Sarr=str.split(" ");
		
		int[] arr =new int[Sarr.length];
		
		for(int i =0; i<Sarr.length; i++) {
			arr[i]=Integer.parseInt(Sarr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
