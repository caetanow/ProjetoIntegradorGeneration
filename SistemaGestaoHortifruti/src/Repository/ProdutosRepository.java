package Repository;

import Model.Produtos;

public interface ProdutosRepository {
    public void pesquisaIdProduto(int id);
    public void pesquisaNomeProduto(String nome);
    public void listarProdutos();
    public void cadastrarProdutos(Produtos produto);
    public void atualizaPreco(Produtos preco);
    public void deletarProduto(String nome);

}
