package quiz01;

import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		
		
		//제어변수 ->조건 -> 제어변수 증가
		
		//1. 1~입력받은 수 까지의 6의 배수의 합
		
		System.out.print("1번 입력");
		Scanner scan= new Scanner(System.in);
		int a = scan.nextInt();		
		int i = 1;
		int sum = 0;
			
		while(i<=a) {						
								
			if(i%6==0) {
				sum+=i; //6의 배수 일때만 합계
			}			
			i++;			
		}
		System.out.println("1번 답: "+sum);
		
		scan.close();
				
		//2. 1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 갯수
		
		
		int x= 1;
		int cnt= 0; // 갯수를 셀 변수
		
		while(x<=100) {
			if(x%4==0 && x%8!=0) {				
				cnt++;	// 조건 만족시마다 갯수 1개씩  추가			
			}
			x++;
		}
		System.out.println("2번 답: "+cnt +"개");					
		
		//3. 50~100까지 정수들의 합
		
	
		int p = 50;
		int sum2 = 0;
		
		while(p<=100) {
			sum2+=p; //50~100까지 합
			p++;
		}
		System.out.println("3번 답: "+sum2);
		
		
		//4. 1000까지의 약수들의 개수
		
		
		int n =1;
		int cnt2=0;
		
		while(n<=1000) {
			//n이 1000의 약수인지 아닌지 확인함
			if(1000%n==0) {
				cnt2++;
			}
			n++;
		}
		System.out.println("4번 답: "+cnt2 +"개");
		
		
		
		
		
	}

}
