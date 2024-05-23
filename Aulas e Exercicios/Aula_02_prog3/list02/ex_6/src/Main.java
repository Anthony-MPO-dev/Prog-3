public class Main {
    //Repita o exercício anterior, mas agora implemente os métodos
    //translate() e scale() como modificadores.
    public static void main(String[] args){
        Point p = new Point(3, 4);
        p.translate(1.0, 3.0);
        p.scale(0.5);
        p.imprime();
    }
}
