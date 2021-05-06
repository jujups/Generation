package sintaxejava;

import java.util.Scanner;

public class exercicio3 {
public static void main (String args []) {
int idade;

Scanner leia = new Scanner(System.in);
System.out.println("Insira sua idade: ");
idade = leia.nextInt();

if (idade>=10 || idade<=14) {
	
	System.out.printf("Você é da categoria infantil");
	
}else if (idade>14 || idade<=17) {
	
    System.out.printf("Você é da categoria juvenil");
    
} else if (idade>=18 || idade>=25) {
    	
    System.out.printf("Você é da categoria juvenil");
}else {
	System.out.printf("Você não tem categoria.");
}
}
}
