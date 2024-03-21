package Classe.desafio;

public class Pessoas {
	String nome;
	double peso;

	public Pessoas(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;

	}

	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso += comida.peso1;

		}
	}

	String apresentar() {
		return "Olá eu sou o  " + nome + " eu tenho " + peso + " Kg.";
	}
}
