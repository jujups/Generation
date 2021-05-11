package sintaxejava;

import java.util.Scanner;

public class ExerDeMatrizArrays {

	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int [][] matriz = new int [3][3];
		
int i=0, j=0, cont=0;
		
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				System.out.printf("\nDigite um número: [%d][%d]: ", i+1,j+1 );
				matriz [i][j] = leia.nextInt();
				
			}
		}
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				
				
				if (matriz[i][j]>10) {
					cont++;
				}
			}
		}
		
		System.out.print("\nValores maiores que 10: "+cont+"\n");
		
	}
	{
	
	}
}
