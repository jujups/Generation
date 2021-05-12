package POO;

public abstract class Animais {

	private String nome;
	private int idade; 
	
	public Animais(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	abstract void emitirSom ();
		
	
	String mostrarNome () {
		return this.nome;
	}
	
    int mostrarIdade () {
    	return this.idade;
    }
	
    void imprimir () {
    	System.out.println("O(A)" + this.mostrarNome() + "tem" + this.mostrarIdade() + "aninhos.");
    }
	}
	
	


