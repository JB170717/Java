package thread.yield;

public class TestB implements Runnable{

	@Override
	public void run() {
		
		while(true) {
			System.out.println("쓰레드 B 실행중");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
