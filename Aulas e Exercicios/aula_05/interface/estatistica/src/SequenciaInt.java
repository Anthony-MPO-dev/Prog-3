public interface SequenciaInt{
    int next();// retorna o próximo inteiro da sequencia 
    default boolean hasNext(){
        return true;
    }    //true se há um próximo elemento na sequencia
    
}