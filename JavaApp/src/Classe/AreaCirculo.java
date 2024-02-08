package Classe;

public class AreaCirculo {
	double raio;
	static final double Pi = 3.1415;

	AreaCirculo(Double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return Pi * Math.pow(raio, 2);
	}
	static double area(double raio ) {
		
		return Pi * Math.pow(raio, 2);
}
}