package Classe;

public class ValorNullo {
public static void main(String[] args) {
	String s1="";
	System.out.println(s1.concat("!!!"));
	DateExercicio d1 =Math.random()>0.5 ? new DateExercicio():null;
	
	
	if (d1 != null) {
		d1.mes="fev";
		d1.ano=1985;
		d1.dia=21;
		System.out.println(d1.obterDateFormatado());
		
	}
	
	
	String s2=null;
	if (s2 != null) {
		System.out.println(s2.contains("???"));
	
	
	}
		
}

}
