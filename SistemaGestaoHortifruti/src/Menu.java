import Model.Produtos;
import Model.Vendas;

import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Controller.ProdutosController;
import Util.Cores;

import Controller.ProdutosController;

import Model.*;

public class Menu {
	public static Scanner sc = new Scanner(System.in);
    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }

	public static void main(String[] args) throws ParseException {
    	
        int opcao, id, qtd, tipoPagamento;
        String nome, preco, continuar;
        float precoProduto;

        ProdutosController vendas = new ProdutosController();
        ProdutosController produtos = new ProdutosController();
        ProdutosController relatorios = new ProdutosController();

        while (true) {

            System.out.println("======================================");
            System.out.println("||\t\t\tSEJAM BEM VINDOS\t\t||");
            System.out.println("======================================");
            System.out.println("||\t\t( 1 ) GERENCIAMENTO\t\t\t||");
            System.out.println("||\t\t( 2 ) COMPRAS\t\t\t\t||");
            System.out.println("||\t\t( 3 ) SAIR\t\t\t\t\t||");
            System.out.println("======================================");
            System.out.print("Digite uma opção: ");

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite um número inteiro!");
                sc.nextLine();
                opcao = 0;
            }


            if (opcao == 3) {
                System.out.println("\nOBRIGADO!");
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    //Gerenciamento
                    System.out.println("======================================");
                    System.out.println("||\t\t\tGERENCIAMENTO\t\t\t||");
                    System.out.println("======================================");
                    System.out.println("||\t\t( 1 ) CADASTRO\t\t\t\t||");
                    System.out.println("||\t\t( 2 ) RELATORIOS\t\t\t||");
                    System.out.println("||\t\t( 3 ) SAIR\t\t\t\t\t||");
                    System.out.println("======================================");
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("======================================");
                            System.out.println("||\t\t\tCADASTRAR PRODUTO\t\t||");
                            System.out.println("======================================");
                            System.out.println("||\t\t( 1 ) CADASTRAR\t\t\t\t||");
                            System.out.println("||\t\t( 2 ) ALTERAR\t\t\t\t||");
                            System.out.println("||\t\t( 3 ) EXCLUIR\t\t\t\t||");
                            System.out.println("||\t\t( 4 ) SAIR\t\t\t\t\t||");
                            System.out.println("======================================");
                            System.out.print("Digite uma opção: ");
                            opcao = sc.nextInt();

                            switch (opcao) {
                                case 1:
                                    while (true){
                                        System.out.println("\nDigite o nome do produto:");
                                        nome = sc.next().toUpperCase();
                                        System.out.println("\nDigite o preço do produto: ");
                                        preco = sc.next().replace(",",".");
                                        produtos.cadastrarProdutos(new Produtos(produtos.gerarIdProduto(),nome,Float.parseFloat(preco)));
                                        System.out.println("Deseja cadastrar outro produto? (S/N): ");
                                        continuar = sc.next().toUpperCase();
                                        if (continuar.equals("N")) {
                                            break;
                                        }
                                    }
                                keyPress();

                                break;
                                case 2:
                                    boolean continua = true;
                                    String confirma;

                                    while (continua){
                                        System.out.println("==========================================");
                                        System.out.println("||\t\t\t\tATUALIZAR PRODUTO\t\t||");
                                        produtos.listarProdutos();
                                        System.out.print("Digite o ID do produto: ");
                                        opcao = sc.nextInt();
                                        if(produtos.pesquisaIdProduto(opcao) != null){
                                            id = produtos.pesquisaIdProduto(opcao).getIdProduto();
                                            nome = produtos.pesquisaIdProduto(opcao).getNomeProduto();
                                            System.out.print("Digite o novo preço do produto: ");
                                            preco = sc.next().replace(",",".");
                                            produtos.atualizaPreco(new Produtos(id,nome,Float.parseFloat(preco)));

                                            System.out.println("\nO produto não está cadastrado!\nDeseja atualizar novamente? (S/N): ");
                                            confirma = sc.next().toUpperCase();
                                            if(confirma.equals("N")) {
                                                continua = false;
                                            };
                                        }else {
                                            System.out.println("\nO produto não está cadastrado!\nDeseja atualizar novamente? (S/N): ");
                                            confirma = sc.next().toUpperCase();
                                            if(confirma.equals("N")) continua = false;
                                        }
                                    }
                                keyPress();
                                break;
                                case 3:
                                    System.out.println("==========================================");
                                    System.out.println("||\t\t\t\tEXCLUIR PRODUTO\t\t||");
                                    produtos.listarProdutos();
                                    opcao = sc.nextInt();
                                    if(produtos.pesquisaIdProduto(opcao) != null){
                                        produtos.deletarProduto(opcao);
                                    }

                                keyPress();

                                break;
                            }
                        break;
                    }
                break;
                case 2:
                    //compras
                    System.out.println("======================================");
                    System.out.println("||\t\tCARRINHO DE COMPRAS\t\t\t||");
                    System.out.println("======================================");
                    System.out.println("||\t( 1 ) COLOCAR NO CARRINHO\t\t||");
                    System.out.println("||\t( 2 ) REMOVER DO CARRINHO\t\t||");
                    System.out.println("||\t( 4 ) SAIR\t\t\t\t\t\t||");
                    System.out.println("======================================");
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            while (true) {
                                System.out.println("==========================================");
                                System.out.print("||\t\t\tLISTA DE PRODUTOS\t\t\t||");
                                produtos.listarProdutos();
                                System.out.print("Digite uma opção: ");
                                opcao = sc.nextInt();
                                id = produtos.pesquisaIdProduto(opcao).getIdProduto();
                                nome = produtos.pesquisaIdProduto(opcao).getNomeProduto();
                                precoProduto = produtos.pesquisaIdProduto(opcao).getPrecoProduto();

                                System.out.printf("Qual a quantidade de %s deseja incluir no carrinho? ",nome);
                                qtd = sc.nextInt();

                                vendas.addCarrinhoCompra(new Vendas(id,nome,precoProduto,qtd),qtd);
                                System.out.println("\nDeseja adicionar outro produto no carrinho? (S/N): ");
                                continuar = sc.next().toUpperCase();

                                if (continuar.equals("N")) {
                                    break;
                                }
                            }
                        break;
                        case 2:
                            while (true) {
                                System.out.println("==========================================");
                                System.out.print("||\t\t\tCARRINHO DE COMPRAS\t\t\t||");
                                produtos.listarCarrinho();
                                System.out.print("Digite uma opção: ");
                                opcao = sc.nextInt();
                                vendas.removerCarrinho(opcao);

                                vendas.listarCarrinho();

                                System.out.println("\nDeseja remover outro produto do carrinho? (S/N): ");
                                continuar = sc.next().toUpperCase();

                                if (continuar.equals("N")) {
                                    break;
                                }
                            }

                    }
                break;
                default :
                    System.out.println("Opção inválida!");
            }
        }
    }
}
