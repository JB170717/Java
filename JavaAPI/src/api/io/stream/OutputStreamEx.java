package api.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		/*
		 * io패키지의 모든 클래스는 생성자가 throws키워드를 던지고 있어서
		 * 모두 try~catch블록과 함께 사용합니다.
		 * 
		 */	
		
		//경로선언
		String path= "C:\\Users\\user\\Desktop\\course\\java\\file\\hello.txt";// \\hello.txt 이거 내가 추가한거임"
		OutputStream fos =null; //OutputStream fos = new FileOutputStream(path);와 같지만 변수만 밖에서 선언한것	
		try {
			fos=new FileOutputStream(path);
			
			String str ="hey! wake up!";
			fos.write(str.getBytes());			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();				
			} catch (Exception e2) {
			
			}
		}

	}

}
