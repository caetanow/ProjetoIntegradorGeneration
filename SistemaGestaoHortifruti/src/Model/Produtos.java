package Model;

public class Produtos {
    private int idProduto;
    private String nomeProduto;
    private float precoProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public Produtos(int idProduto, String nomeProduto, float precoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    
    public void visualizar() {
        System.out.printf("||\t%d\t|\t%s\t\t\t|\t%.2f\t||\n",getIdProduto(),getNomeProduto(),getPrecoProduto());
    }

}

