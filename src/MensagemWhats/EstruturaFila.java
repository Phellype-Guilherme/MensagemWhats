package MensagemWhats;

public class EstruturaFila<T> {

    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked")
    public EstruturaFila(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaFila(){
        this(10);
    }

    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    protected boolean add(T elemento){
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho )){
            throw new IllegalArgumentException("posicao invalida");
        }
        for (int i=posicao; i<tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    @SuppressWarnings("unchecked")
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementoNovos = (T[]) new Object[this.elementos.length *2];
            for (int i=0; i<this.elementos.length; i++){
                elementoNovos[i] = this.elementos[i];
            }
            this.elementos = elementoNovos;
        }
    }

    public int length(){
        return this.tamanho;
    }

}
