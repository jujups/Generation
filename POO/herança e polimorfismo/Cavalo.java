package POO;

public class Cavalo extends Animais {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	void correr () {
		System.out.println("Correu.");
	}

	void imprimir () {
		System.out.println("O(A)" + this.mostrarNome() + "tem" + this.mostrarIdade() + "aninhos");
	
	}
	@Override
	void emitirSom() {
		System.out.println("Irrinhó");
		
	}
}

