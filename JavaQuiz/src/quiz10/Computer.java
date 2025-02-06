package quiz10;

public class Computer {
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	//멤버변수 선언 (private 멤버변수타입 멤버변수이름)
	private KeyBoard key;
	private Mouse mouse;
	private Monitor monitor;
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer(){
		//각각의 개체(new KeyBoard();)를 만들어서 key라는 멤버변수에 저장
		this.key=new KeyBoard();		
		this.mouse=new Mouse();
		this.monitor=new Monitor();
	}
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard key, Mouse mouse, Monitor monitor){
		this.key=new KeyBoard();
		this.mouse=new Mouse();
		this.monitor=new Monitor();
//		this(key객체,mouse객체,monitor객체);
//		this(new KeyBoard(),new Mouse(),new Monitor());
	}
	
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	
	public void computerInfo() {
		System.out.println(key);
		System.out.println(mouse);
		System.out.println(monitor);
	}

	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public void setKey(KeyBoard key) {
		this.key=key;
	}
	public KeyBoard getKey() {
		return key;
	}
	public void setMouse(Mouse mouse) {
		this.mouse=mouse;
	}
	public Mouse getMouse() {
		return mouse;		
	}
	public void setMonitor(Monitor monitor) {
		this.monitor=monitor;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
