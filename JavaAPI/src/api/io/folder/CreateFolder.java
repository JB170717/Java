package api.io.folder;

import java.io.File;

public class CreateFolder {
	
	public static void main(String[] args) {
		
		/*
		 * 폴더 생성할 때는 File클래스를 사용합니다.
		 * 생성자 매개변수로 폴더를 생성할 경로 + 폴더명 을 지정합니다. 
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\myfolder"; // "\\myfolder"내가 추가한거
		
		try {
			File file =new File(path);
			if(!file.exists()) {  //파일이 존재하면 true
				file.mkdir(); //폴더 생성
				System.out.println("폴더가 생겼습니다");
			}else {
				System.out.println("폴더가 이미 있습니다");
				file.delete(); //폴더 삭제(파일삭제)
				
			}			
					
		} catch (Exception e) {
			e.printStackTrace(); // 꼭찍자.... 에러가 나도 console창에 안뜬다
		}
		
		
		
		
	}

}
