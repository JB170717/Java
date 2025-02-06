package day11.exeception.throws_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * 예외 발생시키기 throw
		 *	
		 * 메서드, 생성자실행도중에 throw키워드를 만나면, 예외가 생성됩니다.
		 * 
		 */
		try {
			
			System.out.println(calc(10));
			System.out.println(calc(-10)); // 잘못된값
			
		} catch (Exception e) {
			//System.out.println("양수 값을 전달하세요.");
			e.printStackTrace(); //개발시에 예외코드 확인
			System.out.println(e.getMessage()); //예외의 메세지
		}
		
	}
	
	public static int calc(int n) throws Exception{
		
		if(n<0) {
			throw new Exception("양수값을 전달");//강제 예외 생성 //return; void메서드가 아니여서..
			//throw로 예외를 생성하면, try~catch또는 throws구문으로 예외를 처리해야합니다.
			
		}
		
		int sum =0;
		for(int i =1; i<=n; i++) {
			sum+=i;
		}
		
		return sum;
		
	}

}
