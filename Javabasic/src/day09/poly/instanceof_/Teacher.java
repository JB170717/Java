package day09.poly.instanceof_;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject=subject;
	}
	
	String info() {
		
		return super.info() + ", 학번:" + subject;
	}
	
}
