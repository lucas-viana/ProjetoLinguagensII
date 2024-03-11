package program;

public class Produto {
    public static int id =0;
    private String nome;
    private String descricao;
    private double preco;
    private int idProduto;
    private int qtd;
    private Fornecedor fornecedor;

    public Produto(String nome, String descricao, int qtd, double preco,Fornecedor fornecedor) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.qtd = qtd;
        this.fornecedor=fornecedor;
        this.idProduto = id;
        id++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}