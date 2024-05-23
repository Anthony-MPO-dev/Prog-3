public class Main {

    /*
        Refaça o exercício 4  implementando o método of()para 
        retornar uma instância de uma classe anônima.
    */
    public static void main(String[] args) {
        
        IntSequence x = IntSequence.of(1, 8, 6, 7);
        
        while(x.hasNext()){
            System.out.println(x.next());
        }
    }
}
