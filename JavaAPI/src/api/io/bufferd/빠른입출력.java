package api.io.bufferd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Scanner;

public class 빠른입출력 {
	
	public static void main(String[] args) {
		
		System.out.println(); //출력
		Scanner scan = new Scanner(System.in); //입력
		
		/*
		 * 빠른 입출력에서는
		 * InputStreamReader
		 * OutputStreamWriter 클래스를 사용합니다.
		 * 
		 */
		
		/*
		 * BufferedReader br = =new BufferedReader(리더 인rd);
		 * Reader rd =new InputStreamReader(InputStream.in);
		 * InputStream.in ==> system.in
		 * 
		 */
	
		BufferedReader br =null;
		BufferedWriter bw =null;	
		try {
			/*BufferedReader*/ br =new BufferedReader(new InputStreamReader(System.in)); //파일경로가 아닌 키보드로부터의 입력new InputStreamReader(System.in)를 받어			
			/*BufferedWriter*/ bw =new BufferedWriter(new OutputStreamWriter(System.out));
			
			//데이터 입력한후에 저장...
			System.out.print(">");			
			String input = br.readLine();
			//저장된 데이터 출력
			bw.write(input);
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		
	}

}
