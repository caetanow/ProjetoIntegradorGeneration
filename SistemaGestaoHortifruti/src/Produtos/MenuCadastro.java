package Produtos;

import java.text.ParseException;

import static Menu.Hortifruti.sc;

public class MenuCadastro {
    private int opcao;
    private boolean continuar = true;

    CadastroProduto cadastroProduto = new CadastroProduto();
    ExcluiProduto excluiProduto = new ExcluiProduto();
    AlteraProduto alteraProduto = new AlteraProduto();
    public void run() throws ParseException {

        while (continuar){
            System.out.println("===================================================================");
            System.out.println("||                    GESTÃO DE PRODUTOS                         ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) CADASTRAR                            ||");
            System.out.println("||                    ( 2 ) ALTERAR                              ||");
            System.out.println("||                    ( 3 ) EXCLUIR                              ||");
            System.out.println("||                    ( 4 ) VOLTAR                               ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastroProduto.cadastrarProduto();
                    break;

                case 2:
                    alteraProduto.alterarProduto();
                    break;

                case 3:
                    excluiProduto.excluirproduto();
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }



        }
    }
}
