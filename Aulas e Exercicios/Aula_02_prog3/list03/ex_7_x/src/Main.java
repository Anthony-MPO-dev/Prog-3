public class Main {
    public static void main(String[] args) {
        
        IntSequence x = (int n) -> {
            return new IntSequence() {

             
                public boolean hasNext(){
                    return true;
                }
    
        
                public int next(){
                    return n;
                }
            };
        };
        while(x.hasNext()){
            System.out.println(x.next());
        }
    }
}
