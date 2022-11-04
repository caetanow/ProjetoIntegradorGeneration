package Navegacao;

import static Menu.Hortifruti.scanner;


public class MenuNavegacao {
    private int opcao;
    public void run(){

        while (opcao !=3){
            System.out.println("===================================================================");
            System.out.println("||                     SEJAM BEM VINDOS                          ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) CADASTRO                             ||");
            System.out.println("||                    ( 2 ) RELATÓRIOS                           ||");
            System.out.println("||                    ( 3 ) VOLTAR                               ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 - Menu Navegação.");
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
