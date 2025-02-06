package day10.Inter.basic2;

public class PetHouse {
	
	//매개변수로 펫 타입을 받아서, 매개변수에 따라서, 알맞은 형변환을 진행하는 메서드
	public static void carePet(IPet a) {
		
		if(a instanceof Dog) {
			Dog d=(Dog)a;
			d.eat();
			d.play();
			d.bark();
		}else if(a instanceof Cat) {
			Cat c=(Cat)a;
			c.eat();
			c.play();
			c.miow();
			//...
		}else if(a instanceof GoldFish) {
			GoldFish g=(GoldFish)a;
			g.swim();
			g.play();
			
			//...
		}
		
	}

}
