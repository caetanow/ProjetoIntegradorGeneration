package Controller;

import java.util.ArrayList;
import Model.Produtos;
import Model.Vendas;
import Repository.ProdutosRepository;

import javax.swing.*;

public class ProdutosController implements ProdutosRepository {

    private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();

    private ArrayList<Vendas> listaVendas = new ArrayList<Vendas>();
    private ArrayList<Vendas> listaCarrinho = new ArrayList<Vendas>();


    @Override
    public Produtos pesquisaIdProduto(int id) {
        for (var produto : listaProdutos){
            if (produto.getIdProduto() == id) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public Produtos pesquisaNomeProduto(String nome) {
        for (var produto : listaProdutos){
            if (produto.getNomeProduto() == nome) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void listarProdutos() {
        if (listaProdutos.isEmpty()){
            System.out.println("Não possui produtos cadastrados.\n" +
                    "Por favor, inicie novamente e cadastre novos produtos.");
            System.exit(JFrame.WIDTH);

        }else {
            System.out.println("\n==========================================");
            System.out.print("||\tID\t|\t\tNOME\t\t|\tPREÇO\t||\n");
            System.out.println("==========================================");

            for (var produtos : listaProdutos) {
                produtos.visualizar();
            }
            System.out.println("==========================================");
        }
    }

    @Override
    public void cadastrarProdutos(Produtos produto) {
        listaProdutos.add(produto);
        System.out.println("\nO produto " + produto.getNomeProduto() + " foi criado com sucesso!");
    }

    public int gerarIdProduto(){
        return listaProdutos.size() + 1;
    }

    @Override
    public void atualizaPreco(Produtos produtos) {
        var buscaProdutos = pesquisaIdProduto(produtos.getIdProduto());

        if(buscaProdutos != null){
            listaProdutos.set(listaProdutos.indexOf(buscaProdutos),produtos);
            System.out.printf("\nO preço d@ %s agora é R$%.2f\n",produtos.getNomeProduto(),produtos.getPrecoProduto() );
        }else
            System.out.println("\nO produto " + produtos.getNomeProduto() + "não foi encontrado!");
    }

    public void deletarProduto(int id) {
        var produto = pesquisaIdProduto(id);

        if (produto != null) {

            if (listaProdutos.remove(produto) == true)
                System.out.println("Produto foi excluído com sucesso!!!");
        }else
            System.out.println("\nO ID: " + id + " não foi localizado!");
    }

    @Override
    public void addCarrinhoCompra(Vendas vendas, int qtd) {
        vendas.setQtd(qtd);
        listaCarrinho.add(vendas);
        System.out.println("\nProduto adicionado no carrinho com sucesso!");
    }

    @Override
    public void listarCarrinho() {
        System.out.println("\n==========================================");
        System.out.print("||\tID\t|\t\tNOME\t\t|\tPREÇO\t|\tQUANTIDADE\t||\n");
        System.out.println("==========================================");

        for (var carrinho : listaCarrinho) {
            carrinho.visualizarVendas();
        }
        System.out.println("==========================================");
    }

    @Override
    public void removerCarrinho(int id) {
        var produto = pesquisaIdProduto(id);

        if (produto != null) {

            if (listaCarrinho.remove(produto) == true)
                System.out.println("Produto foi excluído com sucesso!!!");
        }else
            System.out.println("\nO ID: " + id + " não foi localizadp!");
        for(var carrinho : listaCarrinho){
            carrinho.visualizarVendas();
        }
    }

    @Override
    public boolean carrinhoVazinho() {
        if (listaCarrinho.isEmpty()) {
            return true;
        }
        return false;
    }

}

