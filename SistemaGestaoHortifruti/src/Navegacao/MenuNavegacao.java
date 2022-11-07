package Navegacao;

import static Menu.Hortifruti.sc;
import Produtos.MenuCadastro;
import Relatorios.MenuRelatorios;

import java.text.ParseException;


public class MenuNavegacao {
    private int opcao;
    private boolean ent = true;

    MenuCadastro cadastrar = new MenuCadastro();
    MenuRelatorios menuRelatorios = new MenuRelatorios();

    public void run() throws ParseException {

        while (ent){
            System.out.println("===================================================================");
            System.out.println("||                     SEJAM BEM VINDOS                          ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) CADASTRO                             ||");
            System.out.println("||                    ( 2 ) RELATÓRIOS                           ||");
            System.out.println("||                    ( 3 ) VOLTAR                               ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();

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
