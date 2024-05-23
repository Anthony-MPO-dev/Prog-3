public class Main {
	/*
	Defina os métodos toString(), equals() e hashCode() para as classes do exercício 11.
	*/

    public static void main(String[] args){
        Point p = new PontoRotulado("Ponto-0",3, 4);
		Point j = new PontoRotulado("Ponto-1",3, 4);
        p.imprime();

		System.out.println(p.toString());
		System.out.println(j.toString());
		System.out.println("HashCode: "+((Point)p).hashCode());
		System.out.println("The Points p and j are equal: "+p.equals(j));

    }
}
