package program;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Lucas","111.111.111-11","Rua Coronel Atilho","11111-1111");
		Cliente cliente2 = new Cliente("Julio","222.222.222-22","Rua Coronel Atilho","22222-2222");
		Cliente cliente3 = new Cliente("Antonio","333.333.333-33","Rua Coronel Atilho","33333-3333");

		Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "Rua das Flores, 123", "(11) 5555-1234");
		Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", "Av. Principal, 456", "(22) 9876-5432");
		Fornecedor fornecedor3 = new Fornecedor("Fornecedor C", "Praça Central, 789", "(33) 1234-5678");

		Produto produto1 = new Produto("Leite Moça","Doce derivado de laticinio, rico em açucares",10,5.50,fornecedor1);
		Produto produto2 = new Produto("Café Premium", "Grãos de café selecionados, torrados e moídos", 20, 12.99,fornecedor2);
		Produto produto3 = new Produto("Biscoitos Artesanais", "Biscoitos feitos à mão, crocantes e saborosos", 15, 8.75,fornecedor2);
		Produto produto4 = new Produto("Chá Verde Orgânico", "Chá verde de alta qualidade, cultivado organicamente", 30, 14.50,fornecedor3);

		ItensPedido itensPedidoCliente1 = new ItensPedido(cliente1,"11/03/2024");
		itensPedidoCliente1.addItem(produto1);
		itensPedidoCliente1.addItem(produto2);
		itensPedidoCliente1.addItem(produto3);
		itensPedidoCliente1.addItem(produto4);

		ItensPedido itensPedidoCliente2 = new ItensPedido(cliente2,"11/03/2024");
		itensPedidoCliente2.addItem(produto1);
		itensPedidoCliente2.addItem(produto2);
		itensPedidoCliente2.addItem(produto3);
		itensPedidoCliente2.addItem(produto4);

		ItensPedido itensPedidoCliente3 = new ItensPedido(cliente3,"11/03/2024");
		itensPedidoCliente3.addItem(produto1);
		itensPedidoCliente3.addItem(produto2);
		itensPedidoCliente3.addItem(produto3);
		itensPedidoCliente3.addItem(produto4);

		Pedido pedido1 = new Pedido(cliente1,"11/03/2024",itensPedidoCliente1);
		Pedido pedido2 = new Pedido(cliente1,"11/03/2024",itensPedidoCliente2);
		Pedido pedido3 = new Pedido(cliente1,"11/03/2024",itensPedidoCliente3);

		Transportadora entrega1 = new Transportadora(pedido1,pedido1.getDataPedido(),"Enviado");
		Transportadora entrega2 = new Transportadora(pedido2,pedido2.getDataPedido(),"Enviado");
		Transportadora entrega3 = new Transportadora(pedido3,pedido3.getDataPedido(),"Enviado");


	}

}
