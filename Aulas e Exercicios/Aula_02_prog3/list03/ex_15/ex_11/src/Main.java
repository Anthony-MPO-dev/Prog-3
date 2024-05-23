public class Main {
	/*
	    Defina métodos clone para as classes dos exercícios 11 e 14.
	*/

    public static void main(String[] args) throws CloneNotSupportedException{
        Point p = new PontoRotulado("Ponto 0",3, 4);
		Point p2 = (PontoRotulado) p.clone();
        p.imprime();
		p2.imprime();


        if(p2.equals(p)){ // se apontarem para o mesmo objeto
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
    }
}
