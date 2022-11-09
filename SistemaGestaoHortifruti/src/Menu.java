import java.text.ParseException;

import java.util.Scanner;

import Controller.ProdutosController;

import Model.*;

public class Menu {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
    	
        int opcao;
        String nomeProduto, verifica = "String";
        
        ProdutosController produtos = new ProdutosController();
        System.out.println("\nCriar produtos:\n");

        while (true){

            System.out.println("===================================================================");
            System.out.println("||                     SEJAM BEM VINDOS                          ||");
            System.out.println("===================================================================");
            System.out.println("||                    ( 1 ) GERENCIAMENTO                        ||");
            System.out.println("||                    ( 2 ) COMPRAS                              ||");
            System.out.println("||                    ( 3 ) SAIR                                 ||");
            System.out.println("===================================================================");
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();

            if (opcao == 3) {
                System.out.println("");
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("===================================================================");
                    System.out.println("||                          GERENCIAMENTO                        ||");
                    System.out.println("===================================================================");
                    System.out.println("||                    ( 1 ) CADASTRAR                            ||");
                    System.out.println("||                    ( 2 ) RELATORIOS                           ||");
                    System.out.println("||                    ( 3 ) SAIR                                 ||");
                    System.out.println("===================================================================");
                    System.out.print("Digite uma opção: ");
                    opcao = leia.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("===================================================================");
                            System.out.println("||                      CADASTRAR PRODUTO                        ||");
                            System.out.println("===================================================================");
                            System.out.println("||                    ( 1 ) CADASTRAR                            ||");
                            System.out.println("||                    ( 2 ) ALTERAR                              ||");
                            System.out.println("||                    ( 3 ) LISTAR                               ||");
                            System.out.println("||                    ( 4 ) EXCLUIR                              ||");
                            System.out.println("||                    ( 5 ) SAIR                                 ||");
                            System.out.println("===================================================================");
                            System.out.print("Digite uma opção: ");
                            opcao = leia.nextInt();

                    }        
          
			    switch (opcao) {         
				    case 1:
	                	System.out.println("\nCriar produtos:\n");
	                	
	                	System.out.println("\nDigite o nome do produto:\n");
	                	nomeProduto = leia.next();
	                	verifica = verifica.toLowerCase();
	                	
	                break;
	                case 2:
	
	                break;
	                
	                case 3:
	                	System.out.println("Listar todos os produtos\n\n");
						
						produtos.listarProdutos();
	
	                break;
	                default :
	                    System.out.println("Opção inválida!");
				    
			    }
            
                
            }
        }

    }
}
    

