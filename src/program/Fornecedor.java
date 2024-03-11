package program;

public class Fornecedor {
    private static int id=0;
    private int idFornecedor;
    private String nome;
    private String endereco;
    private String contato;

    public Fornecedor(String nome, String endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.idFornecedor = id;
        id++;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
