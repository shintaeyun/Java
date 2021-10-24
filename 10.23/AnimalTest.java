public class AnimalTest {

	public static void main(String[] args) {
		Eagle e1 = new Eagle();
		e1.mouth = 1;
		e1.wing = 2;
		e1.eat();
		e1.fly();
		e1.sleep();
		
		Tiger t1 = new Tiger();
		t1.mouth = 1;
		t1.leg = 2;
		t1.eat();
		t1.sleep();
		t1.run();
		
		GoldFish g1 = new GoldFish();
		g1.mouth = 1;
		g1.fin = 5;
		g1.eat();
		g1.sleep();
		g1.swim();					
	}

}
