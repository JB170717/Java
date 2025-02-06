package quiz23;

public class Video implements Runnable{

	@Override
	public void run() {
		System.out.print("동영상을 다운로드 합니다:");
		for(int i=1; i<=10;i++) {
			try {
				Thread.sleep(500);
				System.out.print("*");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("\n다운로드가 완료되었습니다");
		
	}

}
