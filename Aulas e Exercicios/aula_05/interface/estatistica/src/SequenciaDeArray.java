public class SequenciaDeArray implements SequenciaInt{
    private int []  meuArray;
    int posicao;

    public SequenciaDeArray(int n){
        meuArray = new int[n];
        for(int i=0; i<n; i++){
            meuArray[i] = i*i;
        }
        this.posicao = 0;
    }

    @Override
    public int next() {
        int pos = posicao;
        posicao++;
        return meuArray[pos];
    }

    @Override
    public boolean hasNext() {//sobrescrito
        
        return (posicao <= meuArray.length);
    }

}