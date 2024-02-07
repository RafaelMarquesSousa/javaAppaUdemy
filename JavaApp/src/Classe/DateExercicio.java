package Classe;

public class DateExercicio {
int ano;
int dia ;
String  mes ;
DateExercicio(){
	dia=1;
	mes="janeiro";
	ano=1970;
}
DateExercicio(String nova){
	dia=17;
	mes="Abril";
	ano=2024;
}
 
DateExercicio(int diaInicial,String mesInicial,int anoInicail ){
	dia=diaInicial;
	mes=mesInicial;
	ano=anoInicail;
	
}
String obterDateFormatado() {
	return String.format("%d/%s/%d \n",dia,mes,ano);

		
	}
//void imprimeformato () {
	//System.out.printf("%d/,%s/,%d\n",dia,mes,ano);
	void imprimeformato () {
		System.out.printf(obterDateFormatado());
}

}
