public class Main {
	/*
	Defina a classe Ponto para representar um ponto com coordenadas x e y.
	Forneça um construtor para inicializar as coordenadas e métodos de acesso 
	getX() e getY(). Defina a subclasse PontoRotulado com um construtor 
	PointoRotulado(String rotulo, double x, double y) e um método de acesso getRotulo().
	*/

    public static void main(String[] args){
        Point p = new PontoRotulado("Ponto 0",3, 4);
        p.imprime();
    }
}
