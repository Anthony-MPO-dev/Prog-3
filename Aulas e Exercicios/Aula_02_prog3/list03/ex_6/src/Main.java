public class Main {

    /*
    
        Adicione à interface IntSequence um método estático com o nome
        constante() que produz uma sequência constante infinita. Por 
        exemplo, IntSequence.constant(1) produz valores 1 1 1..., ad infinitum.

    */
    public static void main(String[] args) {
        
        IntSequence x = IntSequence.constante(1);
        
        while(x.hasNext()){
            System.out.println(x.next());
        }
    }
}


