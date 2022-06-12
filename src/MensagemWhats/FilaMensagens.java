package MensagemWhats;

public class FilaMensagens<T> extends EstruturaFila {


    public FilaMensagens(){
        super();
    }

    public FilaMensagens(int capacidade){
        super(capacidade);
    }

    public void init(){
        return;
    }

    public void enqueue(Mensagem item) {
        this.add(item);

    }

    public T dequeue(){

        final int POS = 0;

        if (this.isEmpty()){
            return null;
        }

        T elemento = (T) this.elementos[POS];

        this.remove(POS);

        return elemento;
    }

}
