package Menu;

import java.util.Scanner;
import Navegacao.MenuNavegacao;

public class Hortifruti {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        MenuNavegacao runNavegacao = new MenuNavegacao();


        while (true){

            System.out.println("===================================================================");
            System.out.println("||                     SEJAM BEM VINDOS                          ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) GERENCIAMENTO                        ||");
            System.out.println("||                    ( 2 ) COMPRAS                              ||");
            System.out.println("||                    ( 3 ) SAIR                                 ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 3) {
                System.out.println("");
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    runNavegacao.run();
                break;
                case 2:
                    System.out.println("Opção 2 - Menu Compras.");
                break;

                default :
                    System.out.println("Opção inválida!");
            }



        }


    }
}
