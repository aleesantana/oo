package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade){
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	
	//Getters
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	//Setters
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade); //deixa o valor positivo.
		if(novaIdade >= 0 && novaIdade <= 130) {
		this.idade = novaIdade;
		} 
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString() {
		return "Olá! Eu sou o " + getNome() 
		+ " e tenho " + getIdade() + " anos.";
	}
}
