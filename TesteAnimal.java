package Animal;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal_1 = new Animal();
		Animal animal_2 = new Animal();
		System.out.println(animal_1.getClass());
		System.out.println(animal_1.getClass().getSimpleName());
		System.out.println(animal_1.hashCode());
		System.out.println(animal_2.hashCode());
	}

}
