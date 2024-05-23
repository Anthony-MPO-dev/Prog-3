public class Main {

    //Implemente a classe Fila, uma fila ilimitada de strings. Forneça os métodos adicionar(), 
    //que adiciona ao fim da fila, ​​e remover(), que remove do início da fila. Armazene os 
    //elementos como uma lista encadeada de objetos da classe No. 

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
    }
    
}
