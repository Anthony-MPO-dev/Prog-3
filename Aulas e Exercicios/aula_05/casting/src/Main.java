public class Main {
    public static void main(String[] args){
        X ref1 = new A();
        X ref2 = new B();
        //testando a chamada de métodos da interface
        ref1.imprime();
        ref2.imprime();

        if(ref1 instanceof A){
            System.out.println("ref1 está apontando para um objeto da classe A");
        }else{
            System.out.println("ref1 não está apontando para um objeto da classe A");
        }

        if(ref2 instanceof A){
            System.out.println("ref2 está apontando para um objeto da classe A");
        }else{
            System.out.println("ref2 não está apontando para um objeto da classe A");
        }

        // não permite chamar funções proprias das classes sem casting
        A refa = (A) ref1;// casting
        B refb = (B) ref2;// casting
        refa.f1();
        refb.f2();
        //((B)ref2).f2(); // casting (conversão)
    }
}
