package POO;

public class Paciente {
	
	String nome;
	int idade;
	String reclama��o;
	String g�nero;

	public Paciente(String nome, int idade, String reclama��o, String g�nero) {
		this.nome = nome;
		this.idade = idade;
		this.reclama��o = reclama��o;
		this.g�nero = g�nero;
		
	}

	public void imprime () {
		System.out.println("A ficha do(a) paciente �:"+"\n "+nome+"\n "+idade+"\n "+reclama��o+"\n "+" "+g�nero);
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

	public String getReclama��o() {
		return reclama��o;
	}

	public void setReclama��o(String reclama��o) {
		this.reclama��o = reclama��o;
	}

	public String getG�nero() {
		return g�nero;
	}

	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
}