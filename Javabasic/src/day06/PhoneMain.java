package day06;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone phone1 =new Phone(); //객체생성할때 생성자가 제일먼저 불려나감
		phone1.info();
		
		Phone red =new Phone("red");
		red.info();
		
		Phone M= new Phone("blue",50000);
		M.info();
		
		Phone myphone = new Phone("아이폰14", "white",1000000);
		myphone.info();
		
	} 
	
}
