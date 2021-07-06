package animal;

import animal.mammal.Bat;
import animal.mammal.Cow;
import animal.mammal.Dog;
import animal.mammal.Mammal;

public class App {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Black", "Rottweiler");

		System.out.println(dog1.getNoOfLegs());
		System.out.println(dog1.getBreed());

		Bat batfink = new Bat("Brown");

		System.out.println(batfink.getNoOfLegs());
		System.out.println(batfink.getColour());

		new Mammal().communicate(); // Hello...
		dog1.communicate(); // Woof
		batfink.communicate(); // Squeek
		new Cow().communicate();

		Zoo zoo = new Zoo();

		zoo.addAnimal(batfink);
		zoo.addAnimal(dog1);
		zoo.addAnimal(new Cow());

		zoo.print();

		Mammal m = new Dog("Brown", "Boxer");

		m.communicate();

		((Dog) m).fetch();

		Dog d = (Dog) m;

		d.fetch();
	}

}
