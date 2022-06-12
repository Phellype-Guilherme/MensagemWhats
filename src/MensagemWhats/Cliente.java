package MensagemWhats;

public class Cliente {

    private String nome;
    private String cpf;
    private String contato;

    public Cliente(String cpf, String nome, String contato) {
        this.cpf = cpf;
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
