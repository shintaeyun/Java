public class MinerTest {

	public static void main(String[] args) {
		Miner mi1 = new Miner("말론");
		Miner mi2 = new Miner("글로리아");
		mi1.mine(3);
		mi2.mine(2);
		mi1.print();
		mi2.print();

	}
}

class Miner {
	String name;
	int coin;

	public Miner(String name) {
		this.name = name;
	}

	void mine(int n) {
		coin = n;
	}

	void print() {
		System.out.println("name : " + name + ", coin : " + coin);
	}

}

