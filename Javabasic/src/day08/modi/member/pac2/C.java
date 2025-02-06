package day08.modi.member.pac2;
//다른패키지
import day08.modi.member.pac1.A;

public class C {
	
	A a =new A(1); //public
//	A a2=new A("홍길동"); //default 같은 패키지 일때 가능 
//	A a3=new A(true); //private (X) 
	
	public C(){
		//요기에서 A안에 변수를 사용하고 싶으면?
		A a4=new A();// 어디서든 상관없으니깐 A의 객체를 만들어
		a4.a = 1; //public
		//a4.b = 1; //default //패키지가 다름
		//a4.c = 1; //private(x)
		
		a4.method01();
		//a4.method02(); //default //패키지가 다름
		//a4.method03(); //private(x)
	}

}
