package Repository;

import Model.Produtos;
import Model.Vendas;

public interface ProdutosRepository {

    //Métodos de cadastro de produtos
    public Produtos pesquisaIdProduto(int id);
    public Produtos pesquisaNomeProduto(String nome);
    public void listarProdutos();
    public void cadastrarProdutos(Produtos produto);
    public void atualizaPreco(Produtos produtos);
    public void deletarProduto(int id);


    //Métodos de Compra de produtos
    public void addCarrinhoCompra(Vendas vendas, int qtd);

    public void listarCarrinho();
    public void removerCarrinho(int id);

    public boolean carrinhoVazinho();



}
