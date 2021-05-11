package POO;

public class Avião {
	

	String modelo;
	String placa;
	String cor;
	String companhia;
	
	public Avião(String modelo, String placa, String cor, String companhia) {
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
	    this.companhia =companhia;
	    
	}
	    
	    public void imprime () {
	    System.out.println("O avião" +modelo+placa+cor+ "da companhia" +companhia+ "está dísponivel.");
	    }

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getCompanhia() {
			return companhia;
		}

		public void setCompanhia(String companhia) {
			this.companhia = companhia;
		}
	    
	    	
	    }
	
	
		

