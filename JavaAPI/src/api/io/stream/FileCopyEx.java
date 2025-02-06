package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {
	
	public static void main(String[] args) {
		
		InputStream fis =null;
		OutputStream fos =null;
		
		String inputPath="C:\\Users\\user\\Desktop\\course\\java\\file\\123.jpg";
		String outPath="C:\\Users\\user\\Desktop\\course\\java\\filecopy\\hello.jpg";
		
		
		try {
			fis= new FileInputStream(inputPath);
			fos= new FileOutputStream(outPath);
			
			//100바이트단위로 읽을꺼임
			byte[] arr =new byte[100];
			
			int result;
			 // 읽은 길이반환, 더이상 읽을 데이터가 없으면 -1 반환
			while( (result=fis.read(arr)) != -1) {				
				//System.out.println(Arrays.toString(arr)); 
				fos.write(arr, 0, result);	//데이터, 시작위치, 쓸위치<읽어들인 길이>			
			}
			System.out.println("파일복사 성공");
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
			
			}
		}
		
		
	}

}
