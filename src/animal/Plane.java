package animal;

public class Plane implements Flyable, Bombable {

	@Override
	public void fly() {
		System.out.println("vroom?");
	}

	@Override
	public void bomb() {
		System.out.println("Tally ho! Bombs away!");
	}

}
