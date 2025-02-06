package quiz11;

public class MainClass {
	
	public static void main(String[] args) {
	
		Warrior w = new Warrior("나는전붕");
		Warrior w2 = new Warrior("타락파워전사");
		Sorceress s1 = new Sorceress("drakeDog");
		
		w.powerStrink(w2);
		w.powerStrink(s1);
		
		w2.info();
		s1.info();
			
		Player[] arr = {w2,s1};
		s1.blizzard(arr);
		
		w2.info();
		s1.info();
	
	}
}
