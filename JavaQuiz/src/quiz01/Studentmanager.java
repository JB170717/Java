package quiz01;

import java.util.Scanner;

public class Studentmanager {
	
	static Scanner scan=new Scanner(System.in);	
	static String[] nameList = new String[100]; //배열을 늘리거나 줄이거나x
	static int[] ageList = new int[100];
	static int count = 0; //고객수
	static int index = -1;//위에 있는 배열에 조회하는 위치(포인터)
	//예를 들어서 index = 0 이면, 배열의 0번째 위치를 조회하고 있음
	
	public static void main(String[] args) {
	
		while(true) {
		
			System.out.println("[현재고객수]" + count + "\n[현재조회위치]:"+index);
			System.out.println("\n[메뉴] 1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7프로그램종료");
			System.out.print("메뉴입력>\n");
			String menu = scan.next();
			
			switch (menu) {			
			case "1":
				System.out.println("=====회원정보를 입력합니다=====");
				add();
				System.out.println("회원정보 입력 성공!!");				
				break;
			case "2":
				/*이전정보출력
				 * index위치를 -1시키고 해당 위치정보를 출력,
				 * 
				 * 이전정보가 존재하지 않는 조건
				 * index <= 0				 * 
				 */
				System.out.println("=====이전 회원 정보를 출력합니다=====");
				if(index<=0) {
					System.out.println("<다음 정보는 없습니다>");
				}else {
					index--;
					printPreinfo();
					System.out.println("=======================");
				}
				break;
				
			case "3":
				System.out.println("=====다음 회원 정보를 출력합니다=====");
				
				if(index>=count-1) {
					System.out.println("<다음 정보는 없습니다>");
				}else {
					index++;
					printInfo();
					System.out.println("=======================");
				}
				
				break;
			case "4":
				/*
				 * 현재 index가 가르키고 있는 위치의 정보를 출력해주면 됩니다.
				 * 
				 * 출력이 가능한조건
				 * index>=0, index<=count -1 작으면 출력이가능합니다.
				 */
				System.out.println("=====현재 회원 정보를 출력합니다=====");
				if(index>=0 && index<=count-1) {
					printInfo();
					System.out.println("=======================");
				}else {
					System.out.println("<다음 정보는 없습니다>");
				}				
				break;
			case "5":
				/*
				 * 정보수정
				 * 새로운 이름, 나이를 입력받아서
				 * 현재 위치를 수정해주면 됩니다.
				 * 
				 * 현재위치가 수정가능한 조건을 생각해보세요.
				 */
				System.out.println("=====회원 정보를 수정합니다=====");
				if(index>=0 && index<=count-1) {
					modify();
					System.out.println("<수정이 완료 되었습니다>");
				}else {
					System.out.println("<현재 정보는 없습니다>");
					
				}
				
				
				break;
			case "6":
				/*
				 * 정보삭제
				 * 현재삭제하려는 index위치부터 ~ 뒤에 있는 배열 요소를 당겨와서 덮어씌어줍니다.
				 * 사람수 count를 감소시키면됨.
				 * 
				 * 삭제가 가능한 조건은 위와 동일함.
				 */
				
				if(index >=0 && index <= count-1) {
					delete();
					count--;
					System.out.println("<삭제가 완료되었습니다.>");
				}else {
					System.out.println("<현재 삭제할 정보가 없습니다.>");
				}								
				break;
			case "7":
				/*
				 * 반복문을 탈출하고 프로그램 종료
				 */
				System.out.println("=====프로그램을 종료합니다=====");
				
				return;
//				System.exit(0));
				
			default:

				System.out.println("메뉴번호를 다시 지정하시오");
				break;

			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	static void add() {
		
		//입력을 받음. 배열에 추가
		
		System.out.println("이름>");
		String name =scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		
		nameList[count]=name;
		ageList[count]=age;
		count++; //고객수증가
		index++;
		
		
		
	}
	static void printPreinfo() {
		System.out.println("이름:" + nameList[index]);
		System.out.println("나이" + ageList[index]);
	}
	static void modify() {
		System.out.println("수정할 이름>");
		String name = scan.next();
		System.out.println("수정할 나이>");
		int age =scan.nextInt();
		
		nameList[index]= name;
		ageList[index] =age;
	}
	static void printInfo() {
		System.out.println("이름:" + nameList[index]);
		System.out.println("나이" + ageList[index]);
	}
	static void printNowinfo() {
		System.out.println("이름:" + nameList[index]);
		System.out.println("나이" + ageList[index]);
	}
	static void editInfo(int index) {

		System.out.println("이름>");
		String name =scan.next();
		nameList[index]=name;
		System.out.println("나이>");
		int age = scan.nextInt();
		ageList[index]=age;
		System.out.println("이름:" + nameList[index]);
		System.out.println("나이" + ageList[index]);
	
	}
	static void delete() {
		for(int i = index; i< count-1 ; i++ ) {
			nameList[i]=nameList[i+1];
			ageList[i]=ageList[i+1];
		}
	}
}
