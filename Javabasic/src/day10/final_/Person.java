package day10.final_;

public class Person {
	
	//final변수
	public final String nation = "대한민국"; //국적
	public final String ssn; //주민번호 - 객체들이 서로 다른값을 가질수 있음
	public String name; //이름
	
	Person(String name, String ssn){
		this.name=name;
		this.ssn=ssn;
	}

}
