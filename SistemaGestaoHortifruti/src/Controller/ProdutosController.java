package Controller;

import java.util.ArrayList;
import Model.Produtos;
import Model.Vendas;
import Repository.ProdutosRepository;

import java.util.ArrayList;

public class ProdutosController implements ProdutosRepository {
	

    private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
    private ArrayList<Vendas> listaVendas = new ArrayList<Vendas>();


    @Override
    public void pesquisaIdProduto(int id) {

    }

    @Override
    public void pesquisaNomeProduto(String nome) {

    }

    @Override
    public void listarProdutos() {
    	 for (var produtos : listaProdutos) {
 			produtos.visualizar();
    	 }

    }

    @Override
    public void cadastrarProdutos(Produtos produto) {
        listaProdutos.add(produto);
        System.out.println("\nO produto:" + produto.getNomeProduto() + "foi criado com sucesso!");
     
    }

    public int gerarIdProduto(){
        return listaProdutos.size() + 1;
    }

    @Override
    public void atualizaPreco(Produtos preco) {

    }

    @Override
    public void deletarProduto(String nome) {

    }

    @Override
    public void addCarrinhoCompra(Vendas vendas, int qtd) {
        vendas.setQtd(qtd);
        listaVendas.add(vendas);
        for(var venda : listaVendas){
            venda.visualizarVendas();
        }
    }

    @Override
    public void removerCarrinho(Produtos idProdutos) {
        var produto = buscarProdutos(idProdutos);

        if (produto != null) {

            if (listaProdutos.remove(idProdutos)==true)

                listaProdutos.remove(produto);

            System.out.println("Produto foi excluído com sucesso!!!");

        }else
            System.out.println("\nO produto: " + idProdutos + " não foi localizadp!");



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