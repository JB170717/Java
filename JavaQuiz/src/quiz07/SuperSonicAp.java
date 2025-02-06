package quiz07;

public class SuperSonicAp extends Airplane {

	/*
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	 * 2. flyMode int형 변수를 선언하세요
	 * 3. fly() 메서드를 오버라딩합니다
	 * 	  fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	 *          flyMode 0이라면, super를 통해 부모님의 메서드를 호출
	 * 4. info() 메서드는 이름을 비행기의 이름, 속도를 리턴하도록 생성하세요.
	 */
	int flyMode=0;

	SuperSonicAp(String name){ //부모에 기본생성자가 없음으로 super(name)으로 연결해줘
		super(name);		
	}
	void fly(){
		if(flyMode==1) {
			System.out.println("고속모드로 비행합니다.");
		}
		if(flyMode==0) {
			super.fly();
		}
	}
	String info(String name,int flyMode) {
		return "기종:"+name+", 모드:"+ flyMode;
	}
	
	
	
	
	
}






