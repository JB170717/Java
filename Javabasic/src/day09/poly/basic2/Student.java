package day09.poly.basic2;


//상속이 없다면? 비슷한 클래스
public class Student extends Person {

	String studentID;
	
	Student(String name, int age, String studentID){
//		super();
//		this.name=name;
//		this.age= age;
		super(name,age);//부모님이 가지고 있는 name, age에 한번에 저장함
		this.studentID=studentID;
	}
	
	
	@Override //어노테이션 - 특정기능을 표현()
	String info() {		
		return super.info()+", 학번:"+studentID;
	}

}
