public class Estatistica {
    //Super tipo que pode receber qualquer 
    //classe que implementam a interface SequenciaInt
    public static float media(SequenciaInt seq, int n){
        float media = 0.0f;
        float soma = 0.0f;
        int contador = 1;

        while((contador <=n) && (seq.hasNext())){
            soma += seq.next();
            contador++;
        }
        media = soma/(contador-1);
        return media;

    }
}
