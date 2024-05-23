public class Main {
    //Implemente a classe Carro que modela um carro viajando
    //em linha reta, consumindo gasolina à medida que se move.
    //Forneça um método que modele a movimentação do carro por 
    //um determinado número de quilómetros, um método para 
    //adicionar um determinado número de litros ao tanque de
    //gasolina, um método para obter a distância corrente da
    //origem e um método para obter o nível de combustível.
    //Especifique a eficiência de combustível (em quilómetros/litro)
    //no construtor. A classe Carro deve ser uma classe imutável?
    //Por que ou Por que não? No programa principal, crie um carro,
    //abasteça, e o faça andar por 50 km. Imprima as informações relacionadas 
    //ao combustível a cada 10 km.

    public static void main(String[] args){
        Carro c1 = new Carro(5.0f);

        c1.abastecer(20);

        c1.dirigir(50);

        System.out.println("\nA distancia percorrida pelo carro até agora foi de "+c1.getKmRodados()+"km \n");
    }
}
