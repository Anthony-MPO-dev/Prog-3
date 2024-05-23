import java.util.Random;

public class SequenciaRandomica implements SequenciaInt{
    private Random gerador;

    //contrutor
    public SequenciaRandomica(){
        gerador = new Random();
    }

    @Override
    public int next() {
        return gerador.nextInt(1000000);
    }

    //Esta usando implementação default do hasNext não precisa ser sobrescrito
    /*@Override
    public boolean hasNext() {
        return true;
    }
    */

}
