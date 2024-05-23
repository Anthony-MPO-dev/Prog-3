import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws Exception {
        Callable<Integer> tarefa1 = ()-> {
            int acc=0;
            for (int i=1; i<=100; i++){
                acc +=i;
            }
            System.out.println("Total thread 1: "+acc);
            return acc;
        };

        Callable<Integer> tarefa2 = ()-> {
            int acc=0;
            for (int i=101; i<=200; i++){
                acc +=i;
            }
            System.out.println("Total thread 2: "+acc);
            return acc;
        };

        Callable<Integer> tarefa3 = ()-> {
            int acc=0;
            for (int i=201; i<=300; i++){
                acc +=i;
            }
            System.out.println("Total thread 3: "+acc);
            return acc;
        };

        Callable<Integer> tarefa4 = ()-> {
            int acc=0;
            for (int i=301; i<=400; i++){
                acc +=i;
            }
            System.out.println("Total thread 4: "+acc);
            return acc;
        };

        Callable<Integer> tarefa5 = ()-> {
            int acc=0;
            for (int i=401; i<=500; i++){
                acc +=i;
            }
            System.out.println("Total thread 5: "+acc);
            return acc;
        };

        ArrayList<Callable<Integer>> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);
        tarefas.add(tarefa3);
        tarefas.add(tarefa4);
        tarefas.add(tarefa5);


        //Cria serviço executor
        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> resultados = executor.invokeAll(tarefas);
        /*
        Future<Integer> res1 = executor.submit(tarefa1);
        Future<Integer> res2 = executor.submit(tarefa2);
        Future<Integer> res3 = executor.submit(tarefa3);
        Future<Integer> res4 = executor.submit(tarefa4);
        Future<Integer> res5 = executor.submit(tarefa5);
        */


        //soma as parciais para obter o total
        int total = 0;//resultados.get(0).get()+resultados.get(1).get()+resultados.get(2).get()+resultados.get(3).get()+resultados.get(4).get();
        for (int i=0; i<5; i++){
            total += resultados.get(i).get();
        }
        //int total = res1.get()+res2.get()+res3.get()+res4.get()+res5.get();

        System.out.println("Total soma das Threads: "+total);
    }
}
