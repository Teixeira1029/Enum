package Enum;

public class PrincipalProdutois {

	public static void main(String[] args) {
		
		
		System.out.println("Produtos"); 
		for (Produtos produtos : Produtos.values()) { 
			System.out.println("---------------"); 
			System.out.println(produtos);
		}
	}

}

	


