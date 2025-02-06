package quiz11;

public class Sorceress extends Player {
	//마법
	
	//1. 생성자 - 이름을 전달받아서, hp = 500, mp = 1000으로 초기화
	//2. 블리자드스킬 - 광역공격기
	//블리자드 스킬은 마나 200을 소모
	//배열안에 들어 있는 모든 객체에 5~15사이의 랜덤한 피해를 한번 발생을 시킵니다.
	//타격당한 플레이어는 체력을 소모해 주면 됩니다.
	//타격당한 플레이어의 이름을 출력
	
	Sorceress(String name) {
		this.name = name;
		this.hp= 500 ;
		this.mp= 1000 ;
	}

	
	public void blizzard(Player[] players) {
		if(this.mp<200) {
			System.out.println("스킬을 사용할 수 없습니다");
			return;
		}else {
			System.out.println(name+"이 blizzard하였습니다.");
			this.mp-=200;	
			for(Player p: players ) {
				p.hp-=(int)(Math.random()*6)+10;
			}
		}
				
	}
	
}
