package ramda.anomymous.basic;

interface Car{
	void run();
}
//카를 구현하는 클래스

class Tico implements Car{

	@Override
	public void run() {
		System.out.println("티코");		
	}	
}

public class Garage {
	
	//public Car car = new Tico();
	//딱 한번만 사용하고, 재활용 할 생각이 없는 클래스는 익명객체로 생성할수 있음
	
	public Car car =new Car() {		
		@Override
		public void run() {
			System.out.println("익명객체 티코입니다.");			
		}
	};
	public Car car2 =new Car() {		
		@Override
		public void run() {
			System.out.println("익명객체 티코2입니다.");			
		}
	};
	
	public static void main(String[] args) {
		
		Garage g =new Garage();
		g.car.run();
		g.car2.run();
		
	}
	
}
