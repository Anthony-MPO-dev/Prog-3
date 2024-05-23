public class Pilha<E> {
    private Object[] pilha = new Object[4];
    private int contador =0;

    public Pilha(){
    }

    public void push(E val){
        System.out.println(val+" foi adicionado a pilha");
        if(contador > 3){
            Object[] pilha2 = new Object[contador+1];
            for(int i =0; i < contador; i++){
                pilha2[i] = pilha[i];
            }

            this.pilha = pilha2;
            this.pilha[contador] = val;
            contador++;
        }
        else{
            pilha [contador] = val;     
            contador++;
        }
    }

    public E pop(){
        if(contador > 0){
            contador--;
            E val = (E) pilha[contador];
            pilha[contador] = null;

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
