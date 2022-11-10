package Repository;

import Model.Produtos;
import Model.Vendas;

public interface ProdutosRepository {

    //Métodos de cadastro de produtos
    public void pesquisaIdProduto(Produtos idProdutos);
    public void pesquisaNomeProduto(Produtos nome);
    public void listarProdutos();
    public void cadastrarProdutos(Produtos produto);
    public void atualizaPreco(Produtos preco);
    public void deletarProduto(String nome);


    //Métodos de Compra de produtos
    public void addCarrinhoCompra(Vendas vendas, int qtd);
    public void removerCarrinho(Produtos idProdutos);

    public void pagamento(int formaPagamento);


}
