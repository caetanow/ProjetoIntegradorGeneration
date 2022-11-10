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
        System.out.printf("||\t%d\t|\t%s\t\t\t|\t\t%.2f\t\t|\t\t%d\t\t|\t%.2f\t||\n",getIdProduto(),getNomeProduto(),getPrecoProduto(),getQtd(),total);
    }
}
