package POO;

public class teste {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro ("Emerson", 3);
		cachorro.imprimir();
		cachorro.emitirSom();
		
		Cavalo cavalo = new Cavalo ("Sheila", 15);
		cavalo.imprimir();
		cavalo.emitirSom();
		
		Preguica preguica = new Preguica ("Patricia", 46);
		preguica.imprimir();
		preguica.emitirSom();
	
	}

}
