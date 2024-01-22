package If;

import java.util.Scanner;

public class SwitchBreak {
public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	
	
	String conceito ="";
	System.out.println("Digite sua nota");
	int nota=entrada.nextInt();
	switch (nota) {
	case 9,10:
		conceito="A";
		break;
	case 7,8:
		conceito="B";
		break;
	case 5,6:
		conceito="C";
	break;
	case 3,4:
		conceito="D";
	break;
	case 1,2:
		conceito="D";
	break;
	default:
	conceito="Não encontrado";
	}
System.out.println("conceito nota "+conceito);

entrada.close();
	}
}

