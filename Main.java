package loja;

public class Main {
	
	public static void main(String[] args) {
		
		Loja paranum = new Loja("Paranum");
		
		Produto produto1 = new Produto("notebook dell", 25, 5);
		Produto produto2 = new Produto("Blusa preta", 2, 99);
		
		paranum.getProdutos().add(produto1);
		paranum.getProdutos().add(produto2);
		
		produto1.removerEstoque(1);
		
		paranum.exibirProdutos();
	}
}
