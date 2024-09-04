package Enum;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		
		System.out.println("Marcas disponivel"); 
		for (Carro carros : Carro.values()) { 
			System.out.println("---------------"); 
			System.out.println(carros);
		}
	}

}
