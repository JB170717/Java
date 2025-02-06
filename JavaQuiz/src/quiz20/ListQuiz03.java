package quiz20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	/*
	 * 회원정보 프로그램 시뮬레이터
	 * 
	 * 무한반복문안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
	 * 
	 * 메뉴 1.유저등록, 2.전체회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료
	 * 
	 * 1. 스캐너로 name, age 입력받아서 User객체를 리스트에 추가.
	 * 2. 모든 회원 정보를  출력하면 됩니다.
	 * 3. 찾을 이름을 입력받아서, 이름이 있으면, 이름과 나이를 출력해줍니다.
	 *    찾는 이름이 없으면 "~~님은 목록에 없습니다"를 출력합니다.
	 * 4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 User를 삭제
	 */
	
	public static void main(String[] args) {
		
		List<User> list = new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴 1.유저등록, 2.전체회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료");
			System.out.println("메뉴>");
			int menu =scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("메뉴1.유저등록");
				String name =scan.next();
				int age =scan.nextInt();
				list.add(new User(name,age));

				break;
				
			case 2:
				System.out.println("메뉴2.전체회원정보출력");
				
				for(User u: list) {
					System.out.println(u.getName()+" , "+u.getAge());
				}
				
//				for(int i=0;i<list.size();i++) {
//					System.out.println("이름: "+list.get(i).getName()+"나이:"+list.get(i).getAge());
//				}
				break;
				
				
			//3. 찾을 이름을 입력받아서, 이름이 있으면, 이름과 나이를 출력해줍니다.
			// *    찾는 이름이 없으면 "~~님은 목록에 없습니다"를 출력합니다 -->> 찾았다 못찾았다를 기록하는 변수를 사용해야대
			case 3:
				System.out.println("메뉴3.회원정보검색");
				String find =scan.next();
				
				boolean bool =true; //못찾았다vs 찾았다 판별할 변수

				for(int i=0;i<list.size();i++) {
					
					User u = list.get(i);
					String name1 = u.getName();
					
					if(find.equals(name1)) {
						System.out.println(u.getName()+" , "+u.getAge());
						bool =false;
					}
					
//					if(list.get(i).getName().equals(find)) {
//						System.out.println("찾았다");
//						bool=false;
//					}
//					if(bool) {
//						System.out.println("못찾았다.");
//					}
					
				}
				
				if(bool) {
					System.out.println(find+"님은 없습니다.");
				}
				
				break;
				//4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 User를 삭제
			case 4:
				System.out.println("메뉴4.회원정보삭제");
				String removename =scan.next();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(removename)){
						list.remove(i);
					}	
				}
				break;
				
			case 5:
				System.out.println("메뉴5.프로그램종료");
				
				return;
				
			default:
				
				System.out.println("메뉴의 번호를 다시 선택하세요.");
				
				break;
			}
		
	}
	}
}
	
	
	
	
	
	
	
	
		

