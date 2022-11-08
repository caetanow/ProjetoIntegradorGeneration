package Menu;

import java.text.ParseException;
import java.util.Scanner;
import Navegacao.MenuNavegacao;
import Vendas.MenuVendas;

public class Hortifruti {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        int opcao;
        MenuNavegacao menuNavegacao = new MenuNavegacao();
        MenuVendas menuVendas = new MenuVendas();


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
                    menuNavegacao.run();
                break;
                case 2:
                    menuVendas.run();
                break;

                default :
                    System.out.println("Programa finalizado!!!");

                    System.out.println("Opção inválida!");
            }
            System.out.println("Programa finalizado!!!");
        }


    }
}
