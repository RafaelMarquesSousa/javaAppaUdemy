package Classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", "Feijão", 0.100, 0.100);
		Comida c2 = new Comida("Carne", "legumes", 0.100, .100);
		
		Pessoas p = new Pessoas("Rafael", 100.0);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		
		
		System.out.println(p.apresentar());

	}
}
