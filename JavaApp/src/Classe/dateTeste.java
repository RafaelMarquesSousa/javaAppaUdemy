package Classe;

public class dateTeste {
public static void main(String[] args) {
	DateExercicio d= new DateExercicio();
	d.dia=21;
	d.mes="feveriro";
	d.ano=1985;
	System.out.println(d.obterDateFormatado());
    /* System.out.printf("%d/%s/%d",d.dia,d.mes,d.ano); 
     Obs ;melhor forma,
	de imprimir dados USUARIO */
    
	var d1=new DateExercicio();
     d1.ano=2024;
     d1.dia=17;
     d1.mes="abril";
     //tipos chamar data formatadas 
     System.out.println(d1.obterDateFormatado());
    // System.out.printf("     %d/%s/%d",d1.dia,d1.mes,d1.ano);
     d1.imprimeformato();//somente imprime terminal 
}
}
