package quiz01;

import java.util.Scanner;

public class Quiz09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b =1 ;
		
		
		if(a>=1 && a<=9) {
			while (b<=9) {
				
				System.out.println( a+ " * " + b +" = "+ a*b );
				b++;			
			}
		}else {
			
		}
		
		scan.close();
		
		
		
	}

}
