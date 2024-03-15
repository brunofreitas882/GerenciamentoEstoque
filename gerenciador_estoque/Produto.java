package gerenciador_estoque;

class Produto {
	private String nome;
	private String codigo;
	private double preco;
	private int quantidadeEstoque;
	private String fornecedor;

	public Produto(String nome, String codigo, double preco, int quantidadeEstoque, String fornecedor) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.fornecedor = fornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	
}

