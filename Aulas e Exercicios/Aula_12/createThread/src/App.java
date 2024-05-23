import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        worker tarefa1 = new worker(1,100);
        worker tarefa2 = new worker(101,200);
        worker tarefa3 = new worker(201,300);
        worker tarefa4 = new worker(301,400);
        worker tarefa5 = new worker(401,500);
        
        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);
        Thread t3 = new Thread(tarefa3);
        Thread t4 = new Thread(tarefa4);
        Thread t5 = new Thread(tarefa5);
        
        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);

        for(Thread t: threads){
            t.start();
        }

        for(Thread t: threads){
            t.join();
        }

        int res1 = tarefa1.getSoma();
        int res2 = tarefa2.getSoma();
        int res3 = tarefa3.getSoma();
        int res4 = tarefa4.getSoma();
        int res5 = tarefa5.getSoma();
        
        int total = res1+res2+res3+res4+res5;

        System.out.println(total);
        

        
    }
}
