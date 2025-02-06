package quiz01;

import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		//키가 140이상이고, 나이가 8세이상이면, 놀이기구 탑승가능
		//아니라면 탑승불가능
		
		System.out.println("키(double)와 나이(int)를 입력하세요");
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("키> ");
		double a= scan.nextDouble();
		System.out.print("나이> ");
		int b = scan.nextInt();
		
		if(a>=140 && b>=8) {
			System.out.println("놀이기구 탑승가능");
		}else {
			System.out.println("탑승불가능");
		}
		
		scan.close();
	}

}
