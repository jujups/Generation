package POO;

public class Preguica extends Animais{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	void subirEmArvores () {
		System.out.println("Subiu na árvore.");
	}

	void imprimir () {
		System.out.println("O(A)" + this.mostrarNome() + "tem" + this.mostrarIdade() + "aninhos");
	}
	
	@Override
	void emitirSom() {
		System.out.println("aaaaaaaa");
		
	}
}
