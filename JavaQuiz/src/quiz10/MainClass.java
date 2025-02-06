package quiz10;

public class MainClass {
	
	public static void main(String[] args) {
//		Computer mypc = new Computer();
		Computer mypc = new Computer(new KeyBoard(),new Mouse(),new Monitor());
		
		
		KeyBoard mykeyboard =new KeyBoard();
		Mouse mymouse = new Mouse();	
		Monitor mymonitor = new Monitor();
		
		mypc.setKey(mykeyboard);
		mypc.setMouse(mymouse);
		mypc.setMonitor(mymonitor);
		
		
		
		////
		KeyBoard key = mypc.getKey();
		Mouse mouse = mypc.getMouse();
		Monitor monitor = mypc.getMonitor();
		///
		key.info();
		mouse.info();
		monitor.info();
		
		
		//mypc.getKey() --> 하면 객체의 주소가 나오지
		System.out.println(mykeyboard);
		System.out.println(mypc.getKey());
		System.out.println(key);
		System.out.println();

		
		
	}

}
