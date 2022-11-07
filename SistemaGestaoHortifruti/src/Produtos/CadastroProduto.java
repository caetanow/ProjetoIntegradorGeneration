package Produtos;

import static Menu.Hortifruti.sc;

public class CadastroProduto {

    public void cadastrarProduto(){
        String nome, p;
        float preco;
        boolean entrada = true;

        while (entrada){

            System.out.println("===================================================================");
            System.out.println("||                     CADASTRAR PRODUTOS                        ||");
            System.out.println("===================================================================");
            System.out.print("Digite o nome do produto: ");
            nome = sc.next();
            System.out.print("Digite o preço do produto: ");
            p = sc.next().replace(",",".");
            preco = Float.parseFloat(p);

            System.out.printf("%s __________ %.2f", nome,preco);
            System.exit(0);

        }
    }
}
