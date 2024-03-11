package program;

public class Produto {
    public static int id =0;
    private String nome;
    private String descricao;
    private double preco;
    private int idProduto;
    private int qtd;

    public Produto(String nome, String descricao, int qtd, double preco) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.qtd = qtd;
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
}