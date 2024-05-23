public class SaqueException extends RuntimeException {//Não checada
    private float saldo;

    //contrutor
    public SaqueException(String msg, float saldo){
        super(msg);
        this.saldo = saldo;
    }

    public float getSaldo(){return this.saldo;}
}
