package atividadeVetorMatriz;
import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vetor[]	= {2,5,1,3,4,9,7,8,10,6} ;
		int x;
		boolean achou = false;
		
		
		
		System.out.println("\nDigite um número inteiro: ");
		x= leia.nextInt();
		
		
		for (int i=0; i<vetor.length ; i++) {
			
				
			if (x == vetor[i] ) {
				
				System.out.println("\nO número "+x+" está na posição "+i);
			achou = true;
			
								
			} 
			
			
		}
		if (achou == false) {
			System.out.println("\nO número "+x+" não foi encontrado");
		}
		
		
		
	}

}
