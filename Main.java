package List5;
//questao34
public class Main {
	public static void main(String[] args) {
		AnimalSound[] vectorWithAnimalSound = new AnimalSound[10];

		vectorWithAnimalSound[0] = new ManSound();
		vectorWithAnimalSound[1] = new DogSound();
		vectorWithAnimalSound[2] = new CatSound();
		vectorWithAnimalSound[3] = new ManSound();
		vectorWithAnimalSound[4] = new DogSound();
		vectorWithAnimalSound[5] = new CatSound();
		vectorWithAnimalSound[6] = new ManSound();
		vectorWithAnimalSound[7] = new DogSound();
		vectorWithAnimalSound[8] = new CatSound();
		vectorWithAnimalSound[9] = new ManSound();
		
		for (int i =0;i<10;i++) {
			vectorWithAnimalSound[i].sound();
			System.out.print("\n");
		}
		
	}

}
