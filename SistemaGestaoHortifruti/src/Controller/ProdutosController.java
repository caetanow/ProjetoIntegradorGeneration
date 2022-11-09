package Controller;

import java.util.ArrayList;
import Model.Produtos;
import Repository.ProdutosRepository;

public class ProdutosController implements ProdutosRepository {
	
	private ArrayList<Produtos> ListaProdutos = new ArrayList<Produtos>();

    @Override
    public void pesquisaIdProduto(int id) {

    }

    @Override
    public void pesquisaNomeProduto(String nome) {

    }

    @Override
    public void listarProdutos() {
    	 for (var produtos : ListaProdutos) {
 			produtos.visualizar();
    	 }

    }

    @Override 
    public void cadastrarProdutos(Produtos produtos) {
        ListaProdutos.add(produtos);
        System.out.println("\nO produto:" + produtos.getNomeProduto() + "foi criado com sucesso!");
        	
 }
    
    @Override
    public void atualizaPreco(Produtos preco) {

    }

    @Override
    public void deletarProduto(String nome) {

    }
}
