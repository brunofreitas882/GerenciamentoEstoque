package gerenciador_estoque;

import java.util.ArrayList;

class estoque {
	ArrayList<Produto> produtos = new ArrayList<>();

	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	public void realizarVenda(String codigo, int quantidade) {
		for (Produto produto : produtos) {
			if (produto.getCodigo().equals(codigo)) {
				if (produto.getQuantidadeEstoque() >= quantidade) {
					produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
					System.out.println("Venda realizada com sucesso!");
					return;
				} else {
					System.out.println("Quantidade insuficiente em estoque!");
					return;
				}
			}
		}
		System.out.println("Produto não encontrado!");
	}

	public void listarProdutos() {
		for (Produto produto : produtos) {
			System.out.println("Nome: " + produto.getNome() + "| Código: " + produto.getCodigo() + "| Preço R$ "
					+ produto.getPreco() + "| Quantidade em estoque: " + produto.getQuantidadeEstoque()
					+ "| Fornecedor: " + produto.getFornecedor());
		}
	}

	public void listarProdutosEstoqueBaixo() {
		int quantidadeMinima = 5;
		for (Produto produto : produtos) {
			if (produto.getQuantidadeEstoque() < quantidadeMinima) {
				System.out.println(
						"Nome: " + produto.getNome() + ", Quantidade em estoque: " + produto.getQuantidadeEstoque());
			}
		}
	}

	public Produto buscarProduto(String codigo, String nome) {
		for (Produto produto : produtos) {
	        if (produto.getCodigo().equalsIgnoreCase(codigo) || produto.getNome().equalsIgnoreCase(nome)) {
	            return produto;
			}
		}
		return new Produto("Produto não encontrado", "", 0.0, 0, "");
	}

	public double calcularValorTotalEstoque() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco() * produto.getQuantidadeEstoque();
		}
		return total;
	}
}