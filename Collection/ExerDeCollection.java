package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerDeCollection {

	public static void main (String [] Args) {

		int op;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoqueLoja = new ArrayList();

		do
		{
			System.out.println("\n************************");
			System.out.println("\nSelecione uma das seguintes opções: ");
			System.out.println("\n1 - Adicionar produto ao estoque");
			System.out.println("\n2 - Remover produto do estoque");
			System.out.println("\n3 - Atualizar o estoque");
			System.out.println("\n4 - Mostrar todo o estoque");
			System.out.println("\n0 - Encerrar");
			System.out.println("\nQual a opção desejada?: ");
			op = leia.nextInt();

			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nQual o produto a ser adicionado?: ");
				String produto = leia.nextLine();
				estoqueLoja.add(produto);
				break;

			case 2:
				leia.nextLine(); 
				System.out.println("\nQual produto remover?: ");
				String produto1 = leia.nextLine();

				if(estoqueLoja.contains(produto1))
				{
					estoqueLoja.remove(produto1);
				}
				else
				{
					System.out.println("\nEste produto não existe no nosso estoque.");
				}
				break;

			case 3:
				leia.nextLine(); 
				System.out.println("\nQual produto atualizar no estoque?: ");
				String verifica = leia.nextLine();
				System.out.println("\nQual novo produto adicionar?: ");
				String novo = leia.nextLine();

				if(estoqueLoja.contains(verifica))
				{
					estoqueLoja.remove(verifica);
					estoqueLoja.add(novo);
				}
				else
				{
					System.out.println("\nEste produto não existe no nosso estoque.");
				}
				break;

			case 4:
				System.out.println("\nLista de produtos do estoque: ");
				System.out.println(estoqueLoja);
				break;

				default:
					System.out.println("\nEncerrando..");
			}
		}while(op!=0);

	}

}

