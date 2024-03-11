package program;

import java.util.List;

public class Pedido {
	private static int id=0;
	private int idPedido;
	private Cliente cliente;
	private String dataPedido;
	private ItensPedido itensPedido;

	public Pedido(Cliente cliente, String dataPedido, ItensPedido itensPedido) {
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.itensPedido = itensPedido;
		this.idPedido = id;
		id++;
	}

	public int getIdPedido() {
		return idPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public List<Produto> getItemPedido() {
		return itensPedido.getListProduto();
	}
	public void setItensPedido(ItensPedido itensPedido) {
		this.itensPedido = itensPedido;
	}
}
