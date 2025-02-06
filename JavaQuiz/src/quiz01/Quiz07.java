package quiz01;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1> ");
		int a = scan.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]> ");
		String operator = scan.next();
		System.out.print("정수2> ");
		int b = scan.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		
		default:		
			System.out.println("사칙연산자을 선택하세요[+, -, *, /]");
			break;
		}
	
		scan.close();
		
	}

}

