package day07.override.basic2;

public class Employee extends Person {

	String department;
	
	String info() {
		
		return "이름:" + name + ", 나이:" + age + ", 학번:" + department;
	}
	
}
