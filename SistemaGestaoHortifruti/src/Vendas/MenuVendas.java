package Vendas;

import static Menu.Hortifruti.sc;

public class MenuVendas {
    private int opcao;
    private boolean continuar = true;

    VendaProduto vendaProduto = new VendaProduto();
    Pagamento pagamento = new Pagamento();

    public void run(){

        while (continuar){
            System.out.println("===================================================================");
            System.out.println("||                    GESTÃO DE VENDAS                           ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) ADICIONAR PRODUTOS NO CARRINHO        ||");
            System.out.println("||                    ( 2 ) REMOVER PRODUTO DO CARRINHO          ||");
            System.out.println("||                    ( 3 ) FINALIZAR COMPRA                    ||");
            System.out.println("||                    ( 4 ) VOLTAR                               ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    vendaProduto.adicionaCarrinho();
                    break;

                case 2:
                    vendaProduto.removeCarrinho();
                    break;

                case 3:
                    pagamento.pagamentoProduto();
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
