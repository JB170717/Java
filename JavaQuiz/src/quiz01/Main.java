package quiz01;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String[] arr=str.split(" ");
		System.out.println(Arrays.toString(arr));
	}

}
