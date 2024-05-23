public class App {

    /*
     Reimplemente a classe Pilha<E>, usando um array para armazenar os elementos. 
     Se necessário, aumente o array no método push. Forneça duas soluções, uma com 
     um array E[] e outra com um array Object[]. Ambas as soluções devem compilar 
     sem warnings. Qual você prefere e por quê?
    */

    public static void main(String[] args){
        Pilha<String> pl = new Pilha<>();

        pl.push("1");
        pl.push("2");
        pl.push("3");
        pl.push("4");
        pl.push("5");
        pl.push("6");

        pl.pop();
        pl.pop();
        pl.pop();
        pl.pop();
        pl.pop();
        pl.pop();
        pl.pop();
        pl.push("1");
        pl.push("2");
        pl.pop();

        pl.isVazia();
        pl.pop();
        pl.isVazia();
    }
}
