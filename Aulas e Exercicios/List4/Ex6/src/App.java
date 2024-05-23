public class App {

    /*
     Implemente uma classe genérica Pilha<E> que gerencia um ArrayList de 
     elementos do tipo E. Forneça os métodos push() para empilhar, pop() 
     para desempilhar e isVazia() para testar se a pilha está vazia.
    */

    public static void main(String[] args){
        Pilha<String> pl = new Pilha<>();

        pl.push("Hola");
        pl.push("Hola migo");
        pl.push("Hola tiao");

        pl.pop();
        pl.pop();
        pl.pop();
        pl.pop();
        pl.pop();
        pl.push("Hola migo");
        pl.push("Hola tiao");
        pl.pop();

        pl.isVazia();
        pl.pop();
        pl.isVazia();
    }
}
