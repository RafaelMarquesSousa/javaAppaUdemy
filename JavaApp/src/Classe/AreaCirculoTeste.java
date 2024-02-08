package Classe;

public class AreaCirculoTeste {
	public static void main(String[] args) {
		AreaCirculo a = new AreaCirculo(10.0);
		// a.pi = 1000000;

		AreaCirculo a2 = new AreaCirculo(5.0);
		/// a2.pi = 00;
		
		System.out.println("A-"+a.area());
		System.out.println("b-"+a2.area());
		System.out.println("c-"+AreaCirculo.Pi);
		System.out.println("d-"+Math.PI);
		System.out.println("e-"+AreaCirculo.area(100));
	}
}
