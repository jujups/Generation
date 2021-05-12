package POO;

public class Cachorro extends Animais {
	
	public Cachorro(String nome, int idade) {
		super (nome, idade);
	}
	void correr () {
		System.out.println("Correu.");
	}

	void imprimir () {
		System.out.println("O(A)" + this.mostrarNome() + "tem" + this.mostrarIdade() + "aninhos");
}
	@Override
	void emitirSom() {
		System.out.println("Au au");
		
	}
}