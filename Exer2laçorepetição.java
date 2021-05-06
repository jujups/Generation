package sintaxejava;

import java.util.Scanner;

public class Exer2laçorepetição {

	public static void main (String [] args) {
	

		int idades, menor = 0, maior= 0, qntIdades = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira sua idade: ");
		idades = leia.nextInt();
		
		while (idades != -99) {
	
			if (idades < 21) {
				menor = menor + 1;
			}
			if (idades > 50) {
				maior = maior + 1;
			}
				qntIdades = qntIdades + 1; 
				System.out.println("Insira sua idade: ");
				idades = leia.nextInt();
		}
			System.out.printf("\nA quantidade total de pessoas é: " + qntIdades);
			System.out.printf("\nA quantidae total de pessoas com menos de 21 anos é: " + menor);
			System.out.printf("\nA quantidae total de pessoas com mais de 50 anos é: " + maior);
			   
	
}
}
