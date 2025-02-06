package day09.static_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c1 =new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("a:"+c1.a);
		System.out.println("b:"+c1.b);
	
	
		Count c2 =new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("a:"+c2.a);
		System.out.println("b:"+c2.b);
	
		Count c3 =new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("a:"+c3.a);
		System.out.println("b:"+c3.b);
		
		//현재 c1.b도 3
		System.out.println(c1.b);
		System.out.println(c2.b);
		
		//static변수는 객체 사이에서 공유하는 변수가 됩니다.(1개 생성되기 때문에)
		
		//★객체를 만들지 않고 사용할수 있다.(클라스 밖에서 형성)
		//★static은 클래스 밖에서 생성되기때문에,
		//★객체 생성 없이 "클래스이름.변수명"으로 접근이 가능합니다.
		
		Count.b++;
		
		
		
		
		
	}

}
