package POO;

public class Paciente {
	
	String nome;
	int idade;
	String reclamação;
	String gênero;

	public Paciente(String nome, int idade, String reclamação, String gênero) {
		this.nome = nome;
		this.idade = idade;
		this.reclamação = reclamação;
		this.gênero = gênero;
		
	}

	public void imprime () {
		System.out.println("A ficha do(a) paciente é:"+"\n "+nome+"\n "+idade+"\n "+reclamação+"\n "+" "+gênero);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getReclamação() {
		return reclamação;
	}

	public void setReclamação(String reclamação) {
		this.reclamação = reclamação;
	}

	public String getGênero() {
		return gênero;
	}

	public void setGênero(String gênero) {
		this.gênero = gênero;
	}
}