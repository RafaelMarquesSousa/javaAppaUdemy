package Classe;

public class dateTeste {
	public static void main(String[] args) {

		DateExercicio d = new DateExercicio();

		var d1 = new DateExercicio(21, "fevereiro", 2024);
		
		var d2 =new DateExercicio("nova");
		
		String dataFormtada1 = d.obterDateFormatado();
		System.out.println(dataFormtada1);
		System.out.println(d1.obterDateFormatado());
		System.out.println(d2.obterDateFormatado());

		d.imprimeformato();
		d1.imprimeformato();
		d2.imprimeformato();
	}
}
