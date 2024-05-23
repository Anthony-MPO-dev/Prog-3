
interface IntSequence{
	
	int next();
	boolean hasNext();
	
	static IntSequence of(int... n) {
		class Sequence implements IntSequence {
			int cont = 0;

			@Override
			public int next() {//retorna o proximo valor do vetor
				return hasNext()? n[cont++] : 0;// enquanto tiver proximo - retorna proximo valor
			}
			
			@Override
			public boolean hasNext() {// verifica se tem mais numeros
				return cont < n.length;//retorna true enquanto tiver numeros no vetor
			}
			
		};
		
		return new Sequence(); //retorna o objeto com a sequencia armazenada
		//Obs: objeto tem como supertipo InTSequence
	}
}
