package sintaxejava;
import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior;
 * 
 */
public class verificaromaiornumero {
public static void main (String[] args) {
int num1,num2,num3;

Scanner leia = new Scanner(System.in);

System.out.println("Insira o primeiro n�mero: ");
num1 = leia.nextInt();

System.out.println("Insira o segundo n�mero: ");
num2 = leia.nextInt();

System.out.println("Insira o terceiro n�mero: ");
num3 = leia.nextInt();

if (num1>num2 && num1>num3) {
	System.out.printf("Esse � o maior n�mero:", num1);
}else if (num2>num1 && num2>num3) {
	System.out.printf("Esse � o maior n�mero:", num2);
}else System.out.printf("Esse � o maior n�mero:", num3);
}
}
