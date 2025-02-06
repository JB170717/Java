package day08.encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		
		Hotel h=new Hotel();	
		Chef c = new Chef();
		//setter
		h.setChef(c);
		// h.setChef(객체가 들어가야댐)
		// h.setChef(new Chef())
		
		//getter
		Chef chef = h.getChef(); 
		//호출되는게 Chef클라스객체가 옴
		chef.cooking();
		
	}

}
