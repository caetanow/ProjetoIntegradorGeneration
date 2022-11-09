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
<<<<<<< HEAD
    
    public void visualizar() {
    	
    	System.out.println("\n\n*********************************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("*********************************************************************");
		System.out.println("ID do produto: " + this.idProduto);
		System.out.println("Nome do produto: " + this.nomeProduto);
		System.out.println("Preço do produto: " + this.precoProduto);
		
    }
=======

>>>>>>> d726793b2611d2bf6d6084401c55cac5a20ba037
}

