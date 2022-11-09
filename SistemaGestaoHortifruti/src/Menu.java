import Model.Vendas;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Controller.ProdutosController;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        int opcao, id;
        float preco;
        String nome;
        Vendas c1 = new Vendas(1,"abobora", 2.5f,1);

        ProdutosController vendas = new ProdutosController();

        while (true){

            System.out.println("======================================================================");
            System.out.println("||\t\t\t\t\t\tSEJAM BEM VINDOS\t\t\t\t\t\t\t||");
            System.out.println("======================================================================");
            System.out.println("||\t\t\t\t\t\t( 1 ) GERENCIAMENTO\t\t\t\t\t\t\t||");
            System.out.println("||\t\t\t\t\t\t( 2 ) COMPRAS\t\t\t\t\t\t\t\t||");
            System.out.println("||\t\t\t\t\t\t( 3 ) SAIR\t\t\t\t\t\t\t\t\t||");
            System.out.println("======================================================================");
            System.out.print("Digite uma opção: ");
            try {
                opcao = sc.nextInt();
            }catch (InputMismatchException e){
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
                    System.out.println("======================================================================");
                    System.out.println("||\t\t\t\t\t\tGERENCIAMENTO\t\t\t\t\t\t\t\t||");
                    System.out.println("======================================================================");
                    System.out.println("||\t\t\t\t\t\t\t( 1 ) CADASTRAR\t\t\t\t\t\t\t||");
                    System.out.println("||\t\t\t\t\t\t\t( 2 ) RELATORIOS\t\t\t\t\t\t||");
                    System.out.println("||\t\t\t\t\t\t\t( 3 ) SAIR\t\t\t\t\t\t\t\t||");
                    System.out.println("======================================================================");
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("======================================================================");
                            System.out.println("||\t\t\t\t\t\tCADASTRAR PRODUTO\t\t\t\t\t\t\t||");
                            System.out.println("======================================================================");
                            System.out.println("||\t\t\t\t\t\t\t( 1 ) CADASTRAR\t\t\t\t\t\t\t||");
                            System.out.println("||\t\t\t\t\t\t\t( 2 ) ALTERAR\t\t\t\t\t\t\t||");
                            System.out.println("||\t\t\t\t\t\t\t( 3 ) EXCLUIR\t\t\t\t\t\t\t||");
                            System.out.println("||\t\t\t\t\t\t\t( 4 ) SAIR\t\t\t\t\t\t\t\t||");
                            System.out.println("======================================================================");
                            System.out.print("Digite uma opção: ");
                            opcao = sc.nextInt();

                    }
                break;
                case 2:
                    System.out.println("======================================================================");
                    System.out.println("||\t\t\t\t\t\tCARRINHO DE COMPRAS\t\t\t\t\t\t\t||");
                    System.out.println("======================================================================");
                    System.out.println("||\t\t\t\t\t\t( 1 ) ADICIONAR PRODUTO NO CARRINHO\t\t\t||");
                    System.out.println("||\t\t\t\t\t\t( 2 ) REMOVER PRODUTO NO CARRINHO\t\t\t||");
                    System.out.println("||\t\t\t\t\t\t( 3 ) FINALIZAR COMPRA\t\t\t\t\t\t||");
                    System.out.println("||\t\t\t\t\t\t( 4 ) SAIR\t\t\t\t\t\t\t\t\t||");
                    System.out.println("======================================================================");
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("======================================================================");
                            System.out.println("||\t\t\t\t\t\tCARRINHO DE COMPRAS\t\t\t\t\t\t\t||");
                            System.out.println("======================================================================");

                            //Incluir método de listar produtos.

                            vendas.addCarrinhoCompra(c1, c1.getQtd());

                            //Médoto de pesquisa de produtos.


                        break;
                    }


                break;

                default :
                    System.out.println("Opção inválida!");
            }
        }
    }
}
