package day10.Inter.basic1;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic basic = new Basic();
		
		basic.method01();
		basic.method02();
		
		//System.out.println(basic.ABC);
		System.out.println(Basic.ABC); //상수는 클래스명에서 가져오는게 맞아
		
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있습니다.
		 * 
		 * 이떄, 다형성으로 동작이 됩니다.
		 */
		
		Inter01 b = new Basic();
		b.method01(); //오버라이드된 메서드 실행
//		b.method02(); 사용불가능
		
		Inter02 b2 = new Basic();
		//b2.method01();
		b2.method02();
		
		
		//인터페이스에서도 클래스 캐스팅을 할 수 있습니다.
		Basic bb = (Basic)b;
		bb.method01();
		bb.method02();
		
		
		
		
		
		
		
	}

}
