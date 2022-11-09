package Controller;

import Model.Produtos;
import Repository.ProdutosRepository;

import java.util.ArrayList;

public class ProdutosController implements ProdutosRepository {

    private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();

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

        var produto = buscarProdutoCollection(nome);

        if (produto != null) {

            if (listaProdutos.remove(nome) == true)
                listaProdutos.remove(produto);
            System.out.println("Produto foi excluído com sucesso!!!");

        } else
            System.out.println("\nO produto: " + nome + " não foi localizadp!");

    }

    public Produtos buscarProdutoCollection(String nome) {

        for (var produto : listaProdutos) {

            if (produto.getNomeProduto() == nome) {

                return produto;
            }
        }

        return null;
    }

}
