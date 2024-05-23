

public interface IntSequence{
    int next();// retorna o próximo inteiro da sequencia 
    boolean hasNext();//true se há um próximo elemento na sequencia

    static IntSequence of(int... n){
        return new IntSequence() {
            int aux = 0 ;

            @Override
            public boolean hasNext(){
                return n.length > aux;
            }

            @Override
            public int next(){
                return n[aux++];
            }
        };
    }

    static IntSequence constante(int n){
        return new IntSequence() {

            @Override
            public boolean hasNext(){
                return true;
            }

            @Override
            public int next(){
                return n;
            }
        };
    }
}