package Navegacao;

import static Menu.Hortifruti.scanner;
import Produtos.MenuCadastro;
import Relatorios.MenuRelatorios;


public class MenuNavegacao {
    private int opcao;
    private boolean ent = true;

    MenuCadastro cadastrar = new MenuCadastro();
    MenuRelatorios menuRelatorios = new MenuRelatorios();

    public void run(){

        while (ent){
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
                    cadastrar.run();
                    break;
                case 2:
                    menuRelatorios.run();
                    break;
                case 3:
                    ent = false;
                    break;

                default :
                    System.out.println("Opção inválida!");
            }



        }
    }
}
