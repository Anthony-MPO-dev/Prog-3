public class Main {

	/*
	Implemente o metodo estatico of() da interface IntSequence 
	que retorna um objeto que reproduz a sequencia de inteiros 
	recebida como argumento. Note que o numero de parametros nao
	é fixo. Por exemplo, IntSequence.of(3, 1, 4, 1, 5, 9) retorna
	um objeto que reproduz uma sequencia com seis valores,  
	IntSequence.of(3, 1, 4, 1, 5, 9, 7, 6) retorna um objeto que 
	reproduz uma sequencia com oito valores. 

	*/
	public static void main(String[] args) {
		IntSequence n1 = IntSequence.of(3, 1, 4, 1, 5, 9);
		
		
		System.out.println("Ex 1: ");
		while (n1.hasNext()) { //while hasNext
			System.out.println(n1.next()); //imprime o proximo valor
		}

		IntSequence n2 = IntSequence.of(3, 1, 4, 1, 5, 9, 7, 6);
		
		System.out.println("Ex 2:");
		while (n2.hasNext()) {//while hasNext
			System.out.println(n2.next()); //imprime o proximo valor
		}
	}
}
