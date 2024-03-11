package program;

import java.util.List;

public class Pedido {
	private static int id=0;
	private int idPedido;
	private Cliente cliente;
	private String dataPedido;
	private ItemPedido itemPedido;

	public Pedido(Cliente cliente, String dataPedido, ItemPedido itemPedido) {
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.itemPedido = itemPedido;
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
		return itemPedido.getListProduto();
	}
	public void setItensPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}
}
