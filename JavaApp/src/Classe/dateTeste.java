package Classe;

public class dateTeste {
	public static void main(String[] args) {

		DateExercicio d = new DateExercicio();

		var d1 = new DateExercicio(21, "fevereiro", 2024);

		d1.imprimeformato();
		System.out.println();
		var d2 = new DateExercicio("matheus");

		String dataFormtada = d.obterDateFormatado();
		System.out.println(dataFormtada);
		System.out.println( d1.obterDateFormatado());
		System.out.println( d2.obterDateFormatado());

		d.imprimeformato();
		System.out.println();
		d1.imprimeformato();
		System.out.println();
		d2.imprimeformato();
	}
}
