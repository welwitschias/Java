package aboutClass;

public class HeroTest {

	public static void main(String[] args) {

		Hero nasus = new Hero("나서스");
		Hero leona = new Hero("레오나");

		Hero.battle(nasus, leona);

	}

}

class Hero {

	String name;
	int hp;
	int damage;

	public Hero(String name) {
		super();
		this.name = name;
		hp = 30;
	}

	public void punch(Hero enemy) {
		damage = (int) ((Math.random() * 10) + 1);
		enemy.hp = enemy.hp - damage;
	}

	public static void battle(Hero champ1, Hero champ2) {
		boolean Attack = true;

		while (champ1.hp > 0 && champ2.hp > 0) {
			if (Attack) {
				champ1.punch(champ2);
				System.out.printf("\"%s\"의 공격으로 \"%s\"가 %d의 피해를 입었습니다.\n", champ1.name, champ2.name, champ1.damage);
				System.out.printf("%s의 남은 HP: %d/30\n", champ2.name, champ2.hp);
				System.out.println();
			} else {
				champ2.punch(champ1);
				System.out.printf("\"%s\"의 공격으로 \"%s\"가 %d의 피해를 입었습니다.\n", champ2.name, champ1.name, champ2.damage);
				System.out.printf("%s의 남은 HP: %d/30\n", champ1.name, champ1.hp);
				System.out.println();
			}
			Attack = !Attack; // 번갈아가면서 싸우게 해준다.
		}

		if (champ1.hp <= 0) {
			System.out.printf("%s가 사망하고, %s가 승리하였습니다.", champ1.name, champ2.name);
		}

		if (champ2.hp <= 0) {
			System.out.printf("%s가 사망하고, %s가 승리하였습니다.", champ2.name, champ1.name);
		}

	}

}