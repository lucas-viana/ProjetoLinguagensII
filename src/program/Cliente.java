package program;

public class Cliente {
    private static int id=0;
    private int idCliente;
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;

    public Cliente(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.idCliente=id;
        id++;
    }

    public static int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
