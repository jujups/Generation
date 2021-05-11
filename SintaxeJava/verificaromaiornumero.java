package sintaxejava;
import java.util.Scanner;

/*Faça um programa que receba três inteiros e diga qual deles é o maior;
 * 
 */
public class verificaromaiornumero {
public static void main (String[] args) {
int num1,num2,num3;

Scanner leia = new Scanner(System.in);

System.out.println("Insira o primeiro número: ");
num1 = leia.nextInt();

System.out.println("Insira o segundo número: ");
num2 = leia.nextInt();

System.out.println("Insira o terceiro número: ");
num3 = leia.nextInt();

if (num1>num2 && num1>num3) {
	System.out.printf("Esse é o maior número:", num1);
}else if (num2>num1 && num2>num3) {
	System.out.printf("Esse é o maior número:", num2);
}else System.out.printf("Esse é o maior número:", num3);
}
}
