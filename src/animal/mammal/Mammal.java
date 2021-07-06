package animal.mammal;

// actually reads:  public class Mammal extends Object
public class Mammal {

	private int noOfLegs;

	private String colour;

	private boolean domesticated;

	public Mammal() {
		super();
	}

	public Mammal(int noOfLegs, String colour, boolean domesticated) {
		super();
		this.noOfLegs = noOfLegs;
		this.colour = colour;
		this.domesticated = domesticated;
	}

	public void communicate() {
		System.out.println("Hello, I am a Mammal");
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isDomesticated() {
		return domesticated;
	}

	public void setDomesticated(boolean domesticated) {
		this.domesticated = domesticated;
	}

}
