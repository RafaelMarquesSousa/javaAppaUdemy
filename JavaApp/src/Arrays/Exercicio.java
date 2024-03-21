package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunosA = new double[4];
		System.out.println(Arrays.toString(notasAlunosA));
		notasAlunosA[0] = 7.9;
		notasAlunosA[1] = 8;
		notasAlunosA[2] = 6.7;
		notasAlunosA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunosA));
		System.out.println(notasAlunosA[0]);
		System.out.println(notasAlunosA[notasAlunosA.length -1]);
		//System.out.println(notasAlunosA[4]);Erro!
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunosA.length; i++) {
			totalAlunoA += notasAlunosA[i];
		}
		System.out.println(totalAlunoA / notasAlunosA.length);
		double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		double totalalunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalalunoB += notasAlunoB[i];
		}
		System.out.println(totalalunoB / notasAlunoB.length);
	}
}
