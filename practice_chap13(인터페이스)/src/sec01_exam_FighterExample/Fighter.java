package sec01_exam_FighterExample;

public class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		System.out.println("이동합니다");
		
	}

	@Override
	public void attack(Unit u) {
		System.out.println("공격합니다");
		
	}

}
