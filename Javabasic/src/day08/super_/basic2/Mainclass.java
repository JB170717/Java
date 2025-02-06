package day08.super_.basic2;

public class Mainclass {
	
	public static void main(String[] args) {
		
		Student s =new Student("홍길동",20,"123456");
		System.out.println(s.info());
		
		//teacher, Employee도 생성자를 만들고, 객체 생성해주세요
		Teacher t= new Teacher("권수빈", 29, "프로그래밍");
		System.out.println(t.info());
	
		Employee e= new Employee("김형민",56,"건설");
		System.out.println(e.info());
	
	} 
	

}
