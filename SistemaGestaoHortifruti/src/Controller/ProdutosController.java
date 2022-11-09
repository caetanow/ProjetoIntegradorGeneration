package Controller;

import Model.Produtos;
import Repository.ProdutosRepository;

public class ProdutosController implements ProdutosRepository {

    @Override
    public void pesquisaIdProduto(int id) {

    }

    @Override
    public void pesquisaNomeProduto(String nome) {

    }

    @Override
    public void listarProdutos() {

    }

    @Override
    public void cadastrarProdutos(Produtos produto) {

    }

    @Override
    public void atualizaPreco(Produtos preco) {
    	var buscaProduto = buscarNaCollection(produto.getIdProduto());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			
			System.out.println("\nO preço do produto " + produto.getNomeProduto() + " foi atualizado com sucesso!");
		}else
			System.out.println("\nO produto " + produto.getNomeProduto() + " não foi encontrado!");
    }

    @Override
    public void deletarProduto(String nome) {

    }
}
