package POO;

public class teste {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro ("Emerson", 3);
		cachorro.imprimir();
		cachorro.emitirSom("Latindo");
		
		Cavalo cavalo = new Cavalo ("Sheila", 15);
		cavalo.imprimir();
		cavalo.emitirSom("Relinchando");
		
		Preguica preguica = new Preguica ("Patricia", 46);
		preguica.imprimir();
		preguica.emitirSom("Gritando");
	
	}

}
