package If;

public class SwiftchsemBreak {

	public static void main(String[] args) {
		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Preta experiente");

		case "marrom":
			System.out.println("Marrom treiner");

		case "verde":
			System.out.println("verde junior");

		case "amarela":
			System.out.println("amarelo aprendiz");
			break;
		default:
			System.out.println("não sei nada");

		}
		System.out.println("---------------------");
		int idade=3;
		switch (idade) {
		case 3:
			System.out.println("saber  falar e andar");
			
		case 2:
			System.out.println("sabe so andar");
			
		case 1:
			System.out.println("sabe engatinhar");
			break;
			default:
				System.out.println("fim ");
			
		

		}

	}
}
