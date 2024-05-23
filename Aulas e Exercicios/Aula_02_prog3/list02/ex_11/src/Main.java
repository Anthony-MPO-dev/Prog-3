public class Main {

    //Faça a implementação completa da classe Fatura vista em sala 
    //(uma classe aninhada Estática). Forneça um método que imprima 
    //a fatura e um programa de demonstração que constrói e imprime 
    //uma fatura de amostra. 

    public static void main(String[] args){
        Fatura minhaFatura = new Fatura();

        Fatura.Item item1 = new Fatura.Item("Tenis Nike", 1, 400.0);
        minhaFatura.addItem(item1);
        Fatura.Item item2 = new Fatura.Item("Camiseta Lacoste", 1, 300.0);
        minhaFatura.addItem(item2);
        Fatura.Item item3 = new Fatura.Item("Xbox", 1, 3000.0);
        minhaFatura.addItem(item3);

        /*
        minhaFatura.addItem("Tenis Nike", 1, 400.0);
        minhaFatura.addItem("Camiseta Lacoste", 1, 300.0);
        minhaFatura.addItem("Xbox", 1, 3000.0);
        */

        minhaFatura.showItens();

    }
}
