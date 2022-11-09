package Repository;

import Model.Produtos;

public interface ProdutosRepository {

    //Métodos de cadastro de produtos
    public void pesquisaIdProduto(int id);
    public void pesquisaNomeProduto(String nome);
    public void listarProdutos();
    public void cadastrarProdutos(Produtos produto);
    public void atualizaPreco(Produtos preco);
    public void deletarProduto(String nome);


    //Métodos de Compra de produtos
    public void addCarrinhoCompra(Produtos idProdutos, int quantidade);
    public void removerCarrinho(Produtos idProdutos);

    public void pagamento(int formaPagamento);


}
