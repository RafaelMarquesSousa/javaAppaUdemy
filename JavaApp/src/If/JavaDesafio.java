package If;

import java.util.Scanner;

public class JavaDesafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quantidaNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe nota> "
					+ " (ou digite -1 para sair)Nota=");
			nota = entrada.nextDouble();
		
			if (nota <= 10 && nota > 0) {
				total += nota;
				quantidaNotas++;
			} else if (nota != -1) {
				System.out.println("nota inavalida!!!");
			}
		}

		System.out.println("Media de Notas= " + total / quantidaNotas);
		entrada.close();
	}

}
