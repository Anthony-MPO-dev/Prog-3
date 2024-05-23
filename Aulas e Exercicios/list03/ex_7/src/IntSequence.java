public interface IntSequence{
    int next();// retorna o próximo inteiro da sequencia 
    public default boolean hasNext(){//true se há um próximo elemento na sequencia
        return true;
    }

    public static IntSequence constant(int n){
        return () -> n;
    }
}