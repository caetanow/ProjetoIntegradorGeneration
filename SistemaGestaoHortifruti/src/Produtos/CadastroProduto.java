package Produtos;
import Navegacao.MenuNavegacao;
import Produtos.Produtos;
import Vendas.MenuVendas;

import java.util.Scanner;

import static Menu.Hortifruti.scanner;

public class CadastroProduto {
    Scanner sc = new Scanner(System.in);
    public void cadastrarProduto(){
        String nome;
        while (true){

            System.out.println("===================================================================");
            System.out.println("||                     CADASTRO DE PRODUTOS                      ||");
            System.out.println("===================================================================");

            System.out.print("Digite o nome do produto a ser cadastrado: ");
            nome = sc.nextLine();


        }
    }
}
