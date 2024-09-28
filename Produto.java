package loja;

public class Produto {
	private static int contador = 1; 
	private int id;
	private String nome;
	private int quantidade;
	private float preco;
	
	public Produto(String nome, int quantidade, float preco) {
		this.id = contador++;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String detalhesProduto() {
		return "Produto [id=" + id + "\n nome=" + nome + "\n quantidade=" + quantidade + "\n preco=" + preco + "]";
	}
	
	public void adicionarEstoque(int quantidade) {
		if (quantidade > 0) {
			this.quantidade += quantidade;
		} else {
			System.out.println("\nAdicione uma quantidade positiva.");
		}
	}
	
	public void removerEstoque(int quantidade) {
		if (getQuantidade() > 0 && quantidade <= getQuantidade() && quantidade > 0) {
			this.setQuantidade(getQuantidade() - quantidade);
		} else {
			System.out.println("\nQuantidade inválida");
		}
	}
	
}
