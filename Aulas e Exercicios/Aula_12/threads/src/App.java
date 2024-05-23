import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args)throws Exception{
        Runnable tarefa1 = ()-> {
            while(true){
                System.out.println("Tarefa 1");
                //Thread.sleep(500);//meio segundo
            }
        };

        Runnable tarefa2 = ()-> {
            while(true){
                System.out.println("Tarefa 2");
                //Thread.sleep(500);//meio segundo
            }
        };
        // gerenciadores de multithreads
        ExecutorService executor = Executors.newCachedThreadPool(); // rodar diversas tarefas de tempo de vida curta
        ExecutorService executor2 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()/*Numero de processadores disponiveis para execução*/);// tarefas de processamento intensivo - coloca a tarefa em um nucleo e não tira
        executor.execute(tarefa1);
        executor2.execute(tarefa2);

        int n = Runtime.getRuntime().availableProcessors();
        

        while(true){
            System.out.println("Main:\nNumero de processadores: "+n);
        }


    }
}
