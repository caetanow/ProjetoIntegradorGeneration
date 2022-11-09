import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        int opcao;

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

            if (opcao == 3) {
                System.out.println("");
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

                    }

                break;
                case 2:

                break;

                default :
                    System.out.println("Opção inválida!");
            }
        }


    }
}
