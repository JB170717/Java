package quiz21;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileQuiz01 {
	
	/*
	 * 1. 스캐너를 이용해서 파일명을 입력받습니다.
	 * 2. file폴더 하위에 입력받은 파일명으로 파일을 씁니다.
	 * 3. 파일을 쓸 때, "쓰고 싶은 말"을 사용자에게 입력받습니다.
	 * 4.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String filename = scan.next();
		
		String path ="C:\\Users\\user\\Desktop\\course\\java\\file\\"+filename+".txt";
		Writer fw =null;
		try {
			fw =new FileWriter(path);
			System.out.println("쓰고싶은 말을 쓰세요");
			String str =scan.next();			
			fw.write(str);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
	}
}
