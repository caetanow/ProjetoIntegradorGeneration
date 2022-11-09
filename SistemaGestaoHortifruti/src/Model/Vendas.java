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
        System.out.println("======================================================================");
        System.out.println("||\t\t\t\t\t\t\t\tVENDAS\t\t\t\t\t\t\t\t||");
        System.out.println("======================================================================");
        System.out.println("||\tNOME PRODUTO\t|\tPRECO UNITARIO\t|\tQUANTIDADE\t|\tTOTAL\t||");
        System.out.printf("||\t\t%s\t\t|\t\t%.2f\t\t|\t\t%d\t\t|\t%.2f\t||",getNomeProduto(),getPrecoProduto(),getQtd(),total);
        System.out.println("\n======================================================================");
    }
}
