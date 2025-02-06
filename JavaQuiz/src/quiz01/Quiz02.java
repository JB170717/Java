package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1.랜덤한정수 1~100이주어질때, 이값이 5의 배수인지 확인하고, 출력해주세요
		int a=(int)(Math.random()*100)+1;
		String b= a%5 == 0? a+"는 5의 배수입니다" : a+"는 5의 배수가 아닙니다";
		System.out.println(b);		
		
		//2. 랜덤한정수 -5~5가 주어질 때, 언제나 이 값을 절대값으로 출력해주세요 
		
		int x=(int)(Math.random()*11)-5;
		int y= x>=0? x : -x;
		System.out.println(x);
		System.out.println(y);

		System.out.println("-------------------------------------");

		/*
		 * 사과 x개를 상자에 담을 때 필요한 상자의 개수를 구하려고합니다.
		   한 상자에는 최대 10개의 사과가 들어 갈 수 있습니다.

		 * 사과의 개수가 1~150개 랜덤하게 주어질 때, 
		   필요한 바구니의 개수를 구하는 프로그램을 작성하세요.
		 */
		
		int apple= (int)(Math.random()*150)+1;		
		int box =apple%10==0? apple/10 : apple/10 +1;
		
		System.out.println("사과의 개수: "+apple);
		System.out.println("상자의 개수: "+box);
		
		
		
		
		
		
		
		
		
	}
}
