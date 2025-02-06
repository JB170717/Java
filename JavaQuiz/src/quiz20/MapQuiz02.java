package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {
	
	public static void main(String[] args) {
		/*
		메뉴관리 시뮬레이터
		
		무한 반복문안에서 음식 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		
		* 음식메뉴는 key로 등록하고 가격은 value로 등록합니다.
		음식 메뉴 정보
		1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료
		
		1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록
		2. 메뉴와 가격을 전부 출력
		3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
		4. 변경할 메뉴를 받아서 메뉴가 있다면 삭제
		5. 프로그램 
		종료
		*/
		Map<String,Integer> map =new HashMap<>();
		Scanner scan= new Scanner(System.in);	
	
		while(true) {
			System.out.println("1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");
			System.out.println("<메뉴>"); 
			
			int menu=scan.nextInt();

			switch (menu) {
			case 1:
				System.out.print("<음식입력>");
				String newmenu =scan.next();
				System.out.print("<가격입력>");
				int newprice=scan.nextInt();
				if(!map.containsKey(newmenu)) {					
					map.put(newmenu,newprice);					
				}else {
					System.out.println("중복되는 음식이 있습니다.");
				}
				break;

			case 2:
				
				Set<Entry<String, Integer>> entry =map.entrySet();
				for(Entry<String, Integer> a  :entry) {
					System.out.println("<음식> "+a.getKey()+" <금액> "+a.getValue());
				}
				break;
			
			//3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정	
			case 3:
				System.out.println("변경할 음식");
				String replacemenu =scan.next();
				if(map.containsKey(replacemenu)) {
					System.out.println("변경할 금액");
					int replaceprice =scan.nextInt();
					map.put(replacemenu, replaceprice);
				}else {
					System.out.println("그런 음식은 없습니다.");
				}
				break;
			//4. 변경할 메뉴를 받아서 메뉴가 있다면 삭제
			case 4:
				System.out.println("삭제할 음식");
				String deletemenu =scan.next();
				if(map.containsKey(deletemenu)) {
					map.remove(deletemenu);
				}else {
					System.out.println("그런 음식은 없습니다.");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(1);
				
				break;
			default:
				System.out.println("메뉴번호를 다시선택하세요");
				break;
			}
		}
		
		
		
	}

}
