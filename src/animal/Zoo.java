package animal;

import java.util.ArrayList;

import animal.mammal.Mammal;

public class Zoo {

	private ArrayList<Mammal> animals = new ArrayList<>();

	public void addAnimal(Mammal mammal) {
		this.animals.add(mammal);
	}

	public void print() {
		System.out.println(animals);
	}
}
