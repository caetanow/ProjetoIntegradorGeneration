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
        var produto = buscarProdutos(idProdutos);

        if (produto != null) {

            if (listaProdutos.remove(idProdutos)==true)

                listaProdutos.remove(produto);

            System.out.println("Produto foi excluído com sucesso!!!");

        }else
            System.out.println("\nO produto: " + idProdutos + " não foi localizado!");



    }

    public Produtos buscarProdutos(Produtos idProdutos) {

        for (var produto:listaProdutos){

            if (produto.getIdProduto() == idProdutos.getIdProduto()) {

                return produto;
            }

        }

        return null;


    }

    @Override
    public void pagamento(int formaPagamento) {

    }


}
