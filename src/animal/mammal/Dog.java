package animal.mammal;

public class Dog extends Mammal {

	private String breed;

	public Dog(String colour, String breed) {
		super(4, colour, true); // making a Mammal
//		this.setNoOfLegs(4);
//		this.setDomesticated(true);
//		this.setColour(colour);
		this.setBreed(breed);
	}

	@Override // overrides the communicate() method in Mammal
	public void communicate() {
		System.out.println("Woof");
	}

	public void fetch() {
		System.out.println("Get the stick!");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
