package Classe;

public class DateExercicio {
int ano;
int dia ;
String  mes ;

String obterDateFormatado() {
	return String.format("%d/,%s/,/%d \n",dia,mes,ano);

		
	}
//void imprimeformato () {
	//System.out.printf("%d/,%s/,%d\n",dia,mes,ano);
	void imprimeformato () {
		System.out.printf(obterDateFormatado());
}

}
