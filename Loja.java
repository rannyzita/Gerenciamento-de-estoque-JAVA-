package loja;
import java.util.List;
import java.util.ArrayList;

public class Loja {
	private String nome;
	private List<Produto> produtos;
	
	public Loja(String nome) {
		this.nome = nome;
		this.produtos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void exibirProdutos() {
		for (Produto produto : produtos) {
			System.out.println(produto.detalhesProduto());
		}
		System.out.println("\n");
	}
	
	public void buscarProduto(int id) {
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				System.out.println(produto.detalhesProduto());
			} 
		} 
		System.out.println("\nId inválido.");
	}
}
	
	
