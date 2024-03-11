package program;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

/*Classe: Produto

Atributos:
idProduto: int
nome: String
quantidadeEmEstoque: int
precoUnitario: double
Classe: Fornecedor

Atributos:
idFornecedor: int
nome: String
endereco: String
contato: String
Classe: Cliente

Atributos:
idCliente: int
nome: String
endereco: String
contato: String
Classe: Pedido

Atributos:
idPedido: int
cliente: Cliente
dataPedido: Date
itensPedido: List<ItemPedido>
Classe: ItemPedido
*/
public class ItemPedido {
    private static int id;
    private int idPedido;
    private Cliente cliente;
    private String dataPedido;
    private List<Produto> listProduto = new ArrayList<>();

    public ItemPedido(int idPedido, Cliente cliente, String dataPedido, List<Produto> listProduto) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.listProduto = listProduto;
    }

    public static int getId() {
        return id;
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

    public List<Produto> getListProduto() {
        return listProduto;
    }


    public void addItem(Produto produto){
        this.listProduto.add(produto);
    }

    public void RemoveItem(Produto produto){
        this.listProduto.remove(produto);
    }
}
