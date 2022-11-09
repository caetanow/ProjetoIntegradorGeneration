import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        int opcao, id;
        float preco;
        String nome;

        ProdutosController produtos = new ProdutosController();
        System.out.println("\nCriar produtos\n");

        System.out.print("Digite uma opção: ");
        opcao = sc.nextInt();

    }


        while (true){

            System.out.println("===================================================================");
            System.out.println("||                     SEJAM BEM VINDOS                          ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) GERENCIAMENTO                        ||");
            System.out.println("||                    ( 2 ) COMPRAS                              ||");
            System.out.println("||                    ( 3 ) SAIR                                 ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();

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
                    System.out.println("===================================================================");
                    System.out.println("||                          GERENCIAMENTO                        ||");
                    System.out.println("===================================================================");
                    System.out.println("||                    ( 1 ) CADASTRAR                            ||");
                    System.out.println("||                    ( 2 ) RELATORIOS                           ||");
                    System.out.println("||                    ( 3 ) SAIR                                 ||");
                    System.out.println("===================================================================");
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("===================================================================");
                            System.out.println("||                      CADASTRAR PRODUTO                        ||");
                            System.out.println("===================================================================");
                            System.out.println("||                    ( 1 ) CADASTRAR                            ||");
                            System.out.println("||                    ( 1 ) ALTERAR                              ||");
                            System.out.println("||                    ( 2 ) EXCLUIR                              ||");
                            System.out.println("||                    ( 3 ) SAIR                                 ||");
                            System.out.println("===================================================================");
                            System.out.print("Digite uma opção: ");
                            opcao = sc.nextInt();
                            break;
                    }
                    switch (opcao) {
                        case 1:
                            System.out.println("Criar produtos\n\n");

                            System.out.println("Digite o nome do produto:");
                            nomeProduto = leia.next();
                            verifica = verifica.toLowerCase();
                            break;
                    }


                case 2:


                    break;

                default :
                    System.out.println("Opção inválida!");
            }

                break;
                case 2:
                    System.out.println("===================================================================");
                    System.out.println("||                   CARRINHO DE COMPRAS                         ||");
                    System.out.println("===================================================================");
                    System.out.println("||                    ( 1 ) ADICIONAR PRODUTO NO CARRINHO        ||");
                    System.out.println("||                    ( 1 ) REMOVER PRODUTO NO CARRINHO          ||");
                    System.out.println("||                    ( 2 ) FINALIZAR COMPRA                     ||");
                    System.out.println("||                    ( 3 ) SAIR                                 ||");
                    System.out.println("===================================================================");
                    System.out.print("Digite uma opção: ");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("===================================================================");
                            System.out.println("||                   LISTA DE PRODUTOS                           ||");
                            System.out.println("===================================================================");

                            //Incluir método de listar produtos.

                            System.out.print("Digite o ID do produto: ");
                            id = sc.nextInt();

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
