package sintaxejava;

import java.util.Scanner;

public class ExerDeLaçoRepetição {

public static void main (String[] args) {
	
	int contpares = 0, contimpares = 0, varifor, i;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Entre com um nùmero:");
	
	for ( i = 40 ; i<50 ; i++) {
		
		varifor = leia.nextInt();
		
		if(varifor%2 == 0) {
		 contpares = contpares = 1;
		} else {
		contimpares = contimpares +1;
		
		System.out.println("Os números pares são: " + contpares);
		System.out.println("Os números impares são: " + contimpares);
		}
	}
}
}
