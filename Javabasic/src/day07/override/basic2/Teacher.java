package day07.override.basic2;

public class Teacher extends Person {

	String subject;
	
	String info() {
		
		return "이름:" + name + ", 나이:" + age + ", 학번:" + subject;
	}
	
}
