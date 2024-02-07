package Classe;

public class Produto {
String nome;
double preco;
double desconto;
Produto() {
	
}

 
 Produto(String nomeInicial,double precoInicial,
		 double descontoProduto) {
	 nome =nomeInicial;
	 preco=precoInicial;
	 desconto=descontoProduto;
 }
double precoDesconto() {
	 return preco * (1-desconto);
	
}
 double precoDesconto(double descontoGerente) {
	 return preco * (1-desconto+descontoGerente);
}
}