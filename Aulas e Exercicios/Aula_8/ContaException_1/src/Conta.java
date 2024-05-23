public class Conta {
    private float saldo;

    //construtor
    public Conta(float saldo){
        this.saldo = saldo;
    }

    //getters
    public float  getSaldo(){return this.saldo;}

    //deposita
    public void deposita(float valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            throw new IllegalArgumentException("Valor deve ser > 0. Valor pasado "+valor);
        }
    }

    //saca
    public void saque(float valor){
        if(valor <=0){
            throw new IllegalArgumentException("Valor de saque deve ser > 0. Valor pasado "+valor);
        }else{
            if(valor > saldo){
                throw new SaqueException("Valor acima do saldo", this.saldo);
            }else{
                this.saldo -= valor;
            }
        }
    }
}
