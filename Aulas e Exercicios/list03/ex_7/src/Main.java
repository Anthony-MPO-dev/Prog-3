public class Main {
    public static void main(String[] args) {
    
        IntSequence x = IntSequence.constant(5);

        while(x.hasNext()){
            System.out.println(x.next());
        }
        
    }

}
