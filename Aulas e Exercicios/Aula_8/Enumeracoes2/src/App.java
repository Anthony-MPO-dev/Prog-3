import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o primeiro inteiro");
        int n1 = leitor.nextInt();
        System.out.println("Entre com o segundo inteiro");
        int n2 = leitor.nextInt();
        System.out.println("Entre com a operação no formato: SOMA, SUBTRAI, MULTIPLICA, DIVIDE");
        String texto = leitor.next();
        Operacao op = Operacao.valueOf(texto);

        int resultado= op.avalia(n1,n2);
        /*
        switch (op){
            case SOMA: 
                resultado =op.avalia(n1,n2);
                break;
            case SUBTRAI:
                resultado =op.avalia(n1,n2);
                break;
            case MULTIPLICA: 
                resultado =op.avalia(n1,n2);    
                break;
            case DIVIDE:
                resultado =op.avalia(n1,n2);
                break;
            default:
                System.out.println("Operacao invalida"); 
                break;
        }
        */
        System.out.println("O resultado é: "+resultado);

    }
}
