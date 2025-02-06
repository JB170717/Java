package day06.def;

import java.util.Scanner;

//import day06.abc.apple; //다른 패키지의 클래스를 사용할때 import
//import day06.abc.melon;

//해당 패키지의 모든 클래스를 한번에 import하려면
import day06.abc.*; //* -> 모든것




public class MainClass {
	
	public static void main(String[] args) {
		
		//apple => 데이터 타입!
		apple a =new apple();	
		// 모든 클래스는 데이터 타입이 될수 있다? yes
		melon m =new melon();
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println(a); //주소값
	} 
	
}
