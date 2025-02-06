package day08.modi.member.pac1;
//같은 패키지
public class B {
	A a =new A(1); //public
	A a2=new A("홍길동"); //default 같은 패키지 일때 가능
	//A a3=new A(true); //private (X) 외부에서 접근이 불가능함 //밖에서 객체생성을 못하게 할때. 생성자 private

	
	public B() {
		//요기에서 A안에 변수를 사용하고 싶으면?
		A a4=new A();// 어디서든 상관없으니깐 A의 객체를 만들어
		a4.a = 1; //public
		a4.b = 1; //default
		//a4.c = 1; //private(x)
		
		a4.method01();
		a4.method02();
		//a4.method03(); //private(x)
	}









}
