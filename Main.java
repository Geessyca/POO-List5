package list5;
//questao34
public class Main {
	public static void main(String[] args) {
		animal[] vetor = new animal[10];

		vetor[0] = new homem();
		vetor[1] = new dog();
		vetor[2] = new cat();
		vetor[3] = new homem();
		vetor[4] = new dog();
		vetor[5] = new cat();
		vetor[6] = new homem();
		vetor[7] = new dog();
		vetor[8] = new cat();
		vetor[9] = new homem();
		
		for (int i =0;i<10;i++) {
			vetor[i].fala();
			System.out.print("\n");
		}
		
	}

}
