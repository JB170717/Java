package day07.override.basic2;

public class Mainclass {
	
	public static void main(String[] args) {
		
		Person p =new Person(); // 그렇게 많이 쓸 일은 없어 공통된 애라서...
		p.name="홍길동";
		p.age=20;
		System.out.println(p.info());
		
		
		//상속받은 자식클래스들
		//info메서드 오버라이드 됨
		Student s = new Student();
		s.name="박종범";
		s.age=30;
		s.studentID="2016120046";
		System.out.println(s.info()); 
		
		Teacher t= new Teacher();
		t.name="권수빈";
		t.age=29;
		t.subject="java";
		System.out.println(t.info());
		
		Employee e =new Employee();
		e.name="김한울";
		e.age=30;
		e.department="정치";
		System.out.println(e.info());
		
		
		
		
	} 
	

}
