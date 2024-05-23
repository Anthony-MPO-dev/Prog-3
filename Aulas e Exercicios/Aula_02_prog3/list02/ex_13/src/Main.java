public class Main {

    //Refaça o exercício 12 implementando a classe No como uma classe aninhada. 
    //Nesse caso, a classe No deve ser estática ou não? Implemente um iterador, 
    //isto é, um objeto que produz referências para os elementos da fila, um de 
    //cada vez. Implemente a classe Iterador como uma classe aninhada com métodos 
    //next() (retorna uma referência para o próximo No) e hasNext() (retorna true se 
    //houver um próximo No e false caso contrário). Forneça um método iterador() da 
    //Classe Fila que gera um objeto Fila.Iterador. O Iterator deve ser estático ou não?

    public static void main(String[] args) {
        Fila f1 = new Fila();

        f1 = Fila.adicionar(f1, "Anthony");
        f1 = Fila.adicionar(f1, "Vinicius");
        f1 = Fila.adicionar(f1, "Pedro");
        f1 = Fila.adicionar(f1, "Camila");
        f1 = Fila.adicionar(f1, "Paula");

        Fila.imprimeFila(f1);

        f1 = Fila.remover(f1);
        f1 = Fila.remover(f1);

        Fila.imprimeFila(f1);
        
        //iterador recebe a fila e retorna um objeto da mesma que pode
        //retornar apartir do primeiro objeto atual da fila
        //ou seja, o primeiro, se o mesmo tem proximo apos 
        //ele (metodo: hasnext()) e pode retornar esse proximo(se ouver) objeto (metodo: next())
        
        System.out.println(f1.iterador().hasNext());
        System.out.println(f1.iterador().next().getValor());
    }
    
}
