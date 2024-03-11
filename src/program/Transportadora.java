package program;

public class Transportadora {
    private static int id;
    private int idFornecedor;
    private Pedido pedido;
    private String dataEntrega;
    private String status;

    public Transportadora(Pedido pedido, String dataEntrega, String status) {

        this.pedido = pedido;
        this.dataEntrega = dataEntrega;
        this.status = status;
        this.idFornecedor = id;
        id++;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
