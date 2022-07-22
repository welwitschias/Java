package aboutClass;

public class MinerTest {

	public static void main(String[] args) {

		Miner malon = new Miner("말런");
		Miner gloria = new Miner("글로리아");
		
		malon.mine();
		malon.mine();
		malon.mine();
		
		gloria.mine();
		gloria.mine();
		
		System.out.println(malon.toString());
		System.out.println(gloria.toString());

	}

}

class Miner {

	String name;
	int coins;

	public Miner(String name) {
		super();
		this.name = name;
		coins = 0;
	}

	@Override
	public String toString() {
		return "Miner {name: " + name + ", coins: " + coins + "}";
	}

	public void mine() {
		coins = coins + 1;
	}

}