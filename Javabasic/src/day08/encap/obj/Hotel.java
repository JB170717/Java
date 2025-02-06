package day08.encap.obj;

public class Hotel {
	
	//String name과 같이
	//멤버변수에 class타입이 올수도 있다.
	private Chef chef;
	private Employee emp;
	
	//호텔이 생성될 때, chef를 같이 생성한다.
	public Hotel(){
		this.chef= new Chef();		
		// 객체를 저장
		this.emp= new Employee();
	}
	
	//chef변수의 getter, setter
	//setter - 매개변수로 객체를 받는 타입
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	public void setEmp(Employee emp) {
		this.emp=emp;
	}
	
	//getter - 객체를 반환으로 돌려주는 형태
	public Chef getChef() {
		return chef;
	}
	public Employee getEmp() {
		return emp;
	}
	

	

}
