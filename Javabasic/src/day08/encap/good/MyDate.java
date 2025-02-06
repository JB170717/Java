package day08.encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉(가려진) 변수에 접근할 때, 미리 생성해 놓은 getter/setter를 사용합니다.
	 * 
	 * setter메서드 선언
	 * 1. 은닉 변수에 값을 저장하기 위한 메서드
	 * 2. 접근제어자를 public으로 선언하고 이름 (set + 멤버변수명)으로 만듭니다.	  
	 * 
	 */
	
	public void setYear(int year) { //setYear --> 카멜표기법 꼭지켜라....
		//유효성 검증 내용을 추가할 수 도 있음~~
		if(year<1950||year>2025) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		
		this.year=year;
	}
	
	/*
	 * month, day, ssn에 대한 getter, setter를 생성
	 * 
	 * month - 1~12월까지만 저장
	 * day - 1~31일 까지만 저장
	 * ssn- 문자열 13자리까지만 저장
	 */
	public void setMonth(int month) {
		if(month>12||month<1) {
			System.out.println("잘못된 값 입력입니다."); 
			return;
		}
		this.month=month;
	}
	public void setDay(int day) {
		if(month>31||month<1) {
			System.out.println("잘못된 값 입력입니다."); 
			return;
		}
		this.day=day;
	}
	public void setSsn(String ssn) {
		if(ssn.length()>14) {
			System.out.println("잘못된 값 입력입니다."); 
			return;
		}
		this.ssn=ssn;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;		
	}
	public String getSsn() {
		return ssn;
	}
	
	
	/*
	 * getter메서드 선언
	 * 1. 은닉 변수에 값을 조회하기 위한 메서드
	 * 2. 접근제어자 public으로 하고 이름 (get + 멤버변수명)으로 만듭니다.
	 * 
	 */
	
	public int getYear() {
		//유효성 검사를 할 수도 있음~
		return year;
	}
	

}
