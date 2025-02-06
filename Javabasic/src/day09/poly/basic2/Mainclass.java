package day09.poly.basic2;

public class Mainclass {
	
	public static void main(String[] args) {
		
//		//다형성이라는 개념이 없다면?
//		Student s1 = new Student("홍길동",20,"123");
//		Student s2 = new Student("박찬호",30,"456");
//		Student s3 = new Student("소능민",20,"567");	
//		
//		Teacher t1 = new Teacher("강호동", 40, "체육"); 
//		Teacher t2 = new Teacher("뉴재석", 40,"국어"); 
//		
//		Employee e1 = new Employee("조세호", 30, "예능부");
//		
//		//학생배열
//		Student[] students = {s1, s2, s3, /*t1*/};
//		Teacher[] teachers = {t1, t2};
//		Employee[] employees = {e1};
				
		Person s1 = new Student("홍길동",20,"123");
		Person s2 = new Student("박찬호",30,"456");
		Person s3 = new Student("소능민",20,"567");	
		
		Person t1 = new Teacher("강호동", 40, "체육"); 
		Person t2 = new Teacher("뉴재석", 40,"국어"); 
		
		Person e1 = new Employee("조세호", 30, "예능부");
		
		Person[] people = {s1,s2,s3,t1,t2,e1};
		
		
		
		for(Person p: people ) {
			System.out.println(p.info()); //오버라이드된 메서드
		}
		
		System.out.println("------------------------------");
		
		//showStudent에 s1, t1, e1를 각각 전달해보세요
		
		House h = new House();		
		h.showStudent(s1);
		h.showStudent(t2);
		h.showStudent(e1);
		
		
	} 
	

}
