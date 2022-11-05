package Relatorios;

import Relatorios.RelatorioVendas;

import static Menu.Hortifruti.scanner;

public class MenuRelatorios {
    private int opcao;
    private boolean ent = true;

    RelatorioVendas relatorioVendas = new RelatorioVendas();

    public void run(){

        while (ent){
            System.out.println("===================================================================");
            System.out.println("||                         RELATORIOS                            ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) RELATORIO DE VENDAS                  ||");
            System.out.println("||                    ( 2 ) VOLTAR                               ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    relatorioVendas.sells();
                    break;
                case 2:
                    ent = false;
                    break;

                default :
                    System.out.println("Opção inválida!");
            }



        }
    }
}
