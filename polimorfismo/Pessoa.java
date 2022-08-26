package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	//Métodos
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	//Getters e Setters
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0 ) {
			this.peso = peso;
		}
	}
}
