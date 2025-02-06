package api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 파일을 저장할 때 사용하는 클래스는 FileWriter입니다
		 * 2바이트 기반으로 동작하기 때문에, 한글처리가 가능함.
		 * 
		 */
		
		Writer fw =null;
		
		String path ="C:\\Users\\user\\Desktop\\course\\java\\file\\bye.txt";
		
		try {
			fw=new FileWriter(path);
			
			String str ="지금은 4시12분 입니다~\r\n아 집에가고싶다~ \r\n저먼저 가도 되나요?";
			
			fw.write(str);
			
			System.out.println("파일출력 완료!!");
			
		} catch (Exception e) {
			
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
