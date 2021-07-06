package animal.mammal;

public class Bat extends Mammal {

	public Bat(String colour) {
		this.setNoOfLegs(2);
		this.setDomesticated(false);
		this.setColour(colour);
	}

	@Override // overrides the communicate() method in Mammal
	public void communicate() {
		System.out.println("Squeek");
	}

	public void echoLocation() {
		System.out.println("My super sonic sonar radar will help me");
	}

	public void fly() {
		System.out.println("flap flap flap");
	}
}
