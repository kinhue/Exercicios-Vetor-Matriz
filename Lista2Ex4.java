package atividadeVetorMatriz;
import java.util.Scanner;
public class Lista2Ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float matriz[][] = new float[10][4];
		float vetor[] = new float[10];
		int linha, coluna;
		float nota=0;
		
		for(linha=0 ; linha<10 ; linha++) {
			for(coluna=0 ; coluna<4; coluna++) {
				
				System.out.println("Insira uma nota : ");
				matriz[linha][coluna] = leia.nextFloat();
							
				nota += matriz[linha][coluna];
				
					
			
			}vetor [linha] = nota/4;
			nota=0;
				
			}for (float numero:vetor) {
				System.out.printf("\n%.1f ",numero);
	
		
		}
			
		
	}

}
