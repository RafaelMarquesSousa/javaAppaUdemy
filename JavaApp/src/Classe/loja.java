package Classe;

public class loja {
	public static void main(String[] args) {
		
		
		var desc = new descontoLOJA();
		desc.produto = "tinta";
		desc.preco = 400.00;

		System.out.println(desc.produto + "=" + desc.produtoDesconto());

		var desc1 = new descontoLOJA();
		desc1.preco = 4356.89;
		desc1.produto = "notebook";
		System.out.println(desc1.produto + "=" + desc1.produtoDesconto());

	}

}
