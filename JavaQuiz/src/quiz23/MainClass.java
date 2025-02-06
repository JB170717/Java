package quiz23;

public class MainClass {
	
	public static void main(String[] args) {
		
		//2개의 객체, 스레드 2개 (독립적으로 실행)
		
		Music m= new Music();
		Video v= new Video();
		
		Thread thread1=new Thread(m);
		Thread thread2=new Thread(v);
		
		thread1.start();
		thread2.start();
		
	}

}
