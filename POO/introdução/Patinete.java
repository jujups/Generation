package POO;

public class Patinete {

	String marca;
	String modelo;
	String cor;
	String personagem;
	
	public Patinete(String marca, String modelo, String cor, String personagem) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.personagem = personagem;
	}
	
	public void imprime () {
		System.out.println("Ficha técnica do patinete:" +" "+marca+" "+modelo+" "+cor+" "+personagem);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}
}
