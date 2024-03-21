package Arrays;

public class DesafioArray {
	private static final double totalTudo = 0;

	public static void main(String[] args) {
		double[] contas = { 40.20, 50.21, 30.89, 80.90 };
		double contasTotal = 0;
		for (int i = 0; i < contas.length; i++) {
			contasTotal += contas[i];

	;
			System.out.println();
			System.out.println("Total contas R$"+ contasTotal);
		}
		int[] idade = { 10, 10, 10 };
		int totalIdade = 0;
		for (int i = 0; i < idade.length; i++) {
			totalIdade += idade[i];
			System.out.println("Soma idades= "+totalIdade );
		}
		double[] metros = { 1, 2, 5, 5, 6, 3, 3, 8, 1 };
		double totalMetros = 0;
		for (int i = 0; i < metros.length; i++) {
			totalMetros+=metros[i];
		
			System.out.println("Metros="+totalMetros);

		}
	}
}