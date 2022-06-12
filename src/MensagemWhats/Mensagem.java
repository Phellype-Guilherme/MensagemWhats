package MensagemWhats;

public class Mensagem {

    private Cliente cliente;
    private String texto;

    public Mensagem (Cliente cliente,String texto){
        this.cliente = cliente;
        this.texto = texto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getTexto() {
        return texto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTexto(String mensagem) {
        this.texto = mensagem;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "cliente=" + cliente +
                ", mensagem='" + texto + '\'' +
                '}';
    }
}


