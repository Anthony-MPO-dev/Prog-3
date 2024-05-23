import java.util.ArrayList;

public class Pilha<E> {
    private ArrayList<E> pilha = new ArrayList<>();
    private int contador =0;

    public Pilha(){
    }

    public void push(E val){
        System.out.println(val+" foi adicionado a pilha");
        pilha.add(val);        
        contador++;
    }

    public E pop(){
        if(contador > 0){
            contador--;
            E val = pilha.get(contador);

            pilha.remove(contador);

            System.out.println(val+" foi removido da pilha");
            return val;
        }else{
            System.out.println("Pilha esta vazia não é possivel realizar pop");
            return null;
        }
    }

    public void isVazia(){
        if (contador == 0){
            System.out.println("\nA Pilha estah vazia");
        }else{
            System.out.println("\nA Pilha não estah vazia");
        }
    }

    
}
