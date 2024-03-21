package Classe;

public class DateExercicio {
	int ano=3;
	int dia=2;
	String mes="março";

	DateExercicio() {
		/*
		 * dia=1; mes="janeiro"; ano=1970;
		 */
	/*	this(13, "março", 2024);
	;*/

	}

	DateExercicio(String matheus) {
		dia = 17;
		mes = "Abril";
		ano = 2024;
	}

	DateExercicio(int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	String obterDateFormatado() {
		final String formato = "%d/%s/%d";
		return String.format(formato, this.dia, mes, ano);

	}

//void imprimeformato () {
	// System.out.printf("%d/,%s/,%d\n",dia,mes,ano);
	void imprimeformato() {
		System.out.printf(obterDateFormatado());
	}

}
