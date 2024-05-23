public class App {

    /*

        Implemente uma classe Table<K, V> que gerencia uma ArrayList de objetos 
        Entry<K,V>. Forneça métodos para obter o valor V associado a uma chave K, 
        para armazenar um valor V para uma chave K e para remover uma chave.

    */

    public static void main(String[] args){
        Table<Integer,String> tb = new Table<> (0, "Anthony");

        tb.setTValue(1, "Lucas");
        tb.setTValue(2, "Linder");
        tb.setTValue(3, "Jorge");
        tb.setTValue(4, "Matheus");

        tb.ImprimeT();

        tb.setTValue(1, "Vinicius");
        tb.ImprimeT();

        if(tb.getTValue(4) != null){
            System.out.println("\nBusca: \nChave: 4 Valor: "+tb.getTValue(4));
        }

        if(tb.getTValue(3) != null){
            System.out.println("\nBusca: \nChave: 3 Valor: "+tb.getTValue(3));
        }

        tb.removeTValue(3);
        tb.ImprimeT();

        tb.removeTValue(8);
        tb.ImprimeT();
    }
}
