package sintaxejava;

import java.util.Scanner;

public class Exer3La�osDeRepeti��o {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int media = 0, num, cont = 0;
		
		do {
			num = leia.nextInt();
			if(num%3 == 0) {
				media = media + num;
				cont = cont + 1; 
				}
	
		}while(num != 0);
		
		    System.out.println("A m�dia �: " + (media/cont-1));
		
		}
}
