package day03;

public class IfEx01 {
	
	public static void main(String[] args) {
		
		//랜덤한 정수값
		
		int point= (int)(Math.random()*100)+1; //1~100
		
		System.out.println("점수: " + point);
		
		if(point>=60) {
			System.out.println("올 정처기 합격입니당");
		}else {
			System.out.println("불합격");
		}
		
		
		
	}

}
