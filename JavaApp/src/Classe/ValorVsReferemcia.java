package Classe;

public class ValorVsReferemcia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		a++;
		b--;
		System.out.println(a + "  " + b);

		DateExercicio d1 = new DateExercicio(1, "junho", 2022);

		DateExercicio d2 = d1;
		d1.dia = 31;
		d2.mes = "dezenbro";
		d1.ano = 2025;
		System.out.println(d1.obterDateFormatado());
		System.out.println(d2.obterDateFormatado());
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDateFormatado());
		System.out.println(d2.obterDateFormatado());
	}

	static void voltarDataParaValorPadrao(DateExercicio d) {
		d.dia = 1;
		d.mes = "janeiro";
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}
}
