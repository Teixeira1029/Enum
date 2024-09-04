package Enum;

public class PrincipalMarca {

	public static void main(String[] args) {
		
		System.out.println("Marcas disponivel"); 
		for (Marca marcas : Marca.values()) { 
			System.out.println("---------------"); 
			System.out.println(marcas);
		}
	}

}
