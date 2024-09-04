package Enum;

public class PricipalPedido {

	public static void main(String[] args) {
		StatusPedidos status = StatusPedidos.ABERTO;
		StatusPedidos status1 = StatusPedidos.CANCELADO;
		StatusPedidos status2 = StatusPedidos.EM_ANDAMENTO;
		StatusPedidos status3 = StatusPedidos.ENTREGUE;
		
		
		System.out.println(status); 
		System.out.println(status1);
		System.out.println(status2); 
		System.out.println(status3);

	}

}
