package Controller;

import Model.Produtos;
import Model.Vendas;
import Repository.ProdutosRepository;

import java.util.ArrayList;

public class ProdutosController implements ProdutosRepository {


    private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
    private ArrayList<Vendas> vendas = new ArrayList<Vendas>();


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
        listaProdutos.add(produtos);
        System.out.println("\nO produto:" + produtos.getNomeProduto() + "foi criado com sucesso!");



    }

    @Override
    public void atualizaPreco(Produtos preco) {

    }

    @Override
    public void deletarProduto(String nome) {

    }

    @Override
    public void addCarrinhoCompra(Produtos idProdutos, int quantidade) {

    }

    @Override
    public void removerCarrinho(Produtos idProdutos) {

    }

    @Override
    public void pagamento(int formaPagamento) {

    }


}
