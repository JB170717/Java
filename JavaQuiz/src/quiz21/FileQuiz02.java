package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 날짜클래스를 이용해서 file경로에 20250124.txt이름으로 파일을 씁니다.
		 * 2. 내용은 "그만"을 입력할 때까지 작성해주면 됩니다.
		 * 3. 파일을 섯다면, BufferedReader를 이용해서 파일의 내용을 읽어들이세요.
		 * 
		 */
		
		Date date =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMDD");
		String now = sdf.format(date);
		
		Scanner scan =new Scanner(System.in);
		
		String path ="C:\\Users\\user\\Desktop\\course\\java\\file\\"+now+".txt";
		
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			 bw = new BufferedWriter(new FileWriter(path,true));
			 br = new BufferedReader(new FileReader(path));
			 
			 while(true) {
				 String str =scan.next();				
				 if(str.equals("그만")) {
					 break;
				 }
				 str+="\r\n";
				 bw.write(str);
				 bw.flush(); //버퍼를 비운다
			 }		 
			 String a ;
			 while((a=br.readLine())!=null) {
				 System.out.println(a);
			 }	 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
		
		
	}

}
