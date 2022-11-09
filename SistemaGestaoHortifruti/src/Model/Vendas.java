package Model;

public class Vendas extends Produtos{
    private int qtd;
    public Vendas(int idProduto, String nomeProduto, float precoProduto, int qtd) {
        super(idProduto, nomeProduto, precoProduto);
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void visualizarVendas(){
        float total;
        total = this.getQtd() * getPrecoProduto();
        System.out.println("===================================================================");
        System.out.println("||                               VENDAS                          ||");
        System.out.println("===================================================================");
        System.out.println("||NOME PRODUTO  |   PRECO UNITARIO  |   QUANTIDADE    |  TOTAL   ||");
        System.out.printf("||   %s         |        %.2f       |        %f       |    %.2f  || ",getNomeProduto(),getPrecoProduto(),getQtd(),total);
        System.out.println("===================================================================");
    }
}
