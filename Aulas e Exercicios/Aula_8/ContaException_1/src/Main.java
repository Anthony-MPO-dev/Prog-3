public class Main {

    public static void main(String[] args){
        Conta cli1 = new Conta(1000.0f);
        Conta cli2 = new Conta(2000.0f);

        System.out.println("Saldo cli1:"+cli1.getSaldo());
        System.out.println("Saldo cli2:"+cli2.getSaldo());

        try{
            cli1.deposita(100);    
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        try{
            cli2.deposita(50);    
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Saldo cli1:"+cli1.getSaldo());
        System.out.println("Saldo cli2:"+cli2.getSaldo());
        
        try{
            cli1.saque(500);    
        }catch(IllegalArgumentException | SaqueException ex){
            System.out.println(ex.getMessage());
        }

        try{
            cli2.saque(2500);    
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }catch(SaqueException ex){
            System.out.println(ex.getMessage());
            System.out.println("Saldo atual cli2: "+ex.getSaldo());
        }
        
    }
}
