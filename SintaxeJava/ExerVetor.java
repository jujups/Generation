package sintaxejava;

import java.util.Scanner;

public class ExerVetor {
	
	public static void main (String [] args) {
		

		int[] A = {1, 0, 5, -2, -5, 7}; 
		int somar = 0;
		
		for(int i = 0; i < A.length; i++) {
			if(i == 0 || i == 1 || i == 5) {
				somar = somar + A[i]; 
			}
			if(i == 4) {
				A[i] = 100; // 
			}
			System.out.println("A["+i+"] = "+A[i]); 
		}
		System.out.println("Total da soma A[0], A[1] e A[5]: ="+somar); 	

}

}


