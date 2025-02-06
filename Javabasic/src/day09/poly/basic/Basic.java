package day09.poly.basic;

/*
 * 하나의 파일에 여러 클래스를 선언 할 수도 있습니다.
 * 단, 파일명과 동일한 클래스 반드시 존재해야하고, 해당 클래스만 public이면 됩니다.
 */
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	//내꺼만들어서 내꺼에다가 저장한경우
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a2 = b; //부모타입 A에 자식 B를 저장할 수 있음. // B클라스가  ->A클래스로 자동형변환
	//ex int i =1; 
	//   double j= i; ---> int가 double로 자동형변환
	
	A a3 = new B();
	A a4 = new C();
	A a5 = new D();
	A a6 = new E();
//	C c1 = new D(); // 상속관계가 없으면 다형성 적용이 불가능함
	
	//Object는 최고 부모님 타입인데, 뭐든 다 담을 수 있음? yes
	Object o1 = new A();
	Object o2 = 1;
	Object o3 = "홍길동";
	
	
}
