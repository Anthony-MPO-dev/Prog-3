public class Entrada <T, V>{
    private T chave;
    private V valor;
    
    //construtor
    public Entrada(T chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }

    //getters and setters

    public T getChave() {return chave;}

    public V getValor() {return valor;}
 

    
}