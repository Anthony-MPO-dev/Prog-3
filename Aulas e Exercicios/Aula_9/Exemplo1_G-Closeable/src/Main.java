import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        PrintWriter out1 = new PrintWriter("file1.txt");
        PrintWriter out2 = new PrintWriter("file2.txt");
        PrintWriter out3 = new PrintWriter("file3.txt");
        AutoCloseable out4 = () ->System.out.println("Fechou");
        MeuRecurso out5 = new MeuRecurso();
        MeuRecurso out6 = new MeuRecurso();
       /* ArrayList<PrintWriter> arr = new ArrayList<>();
        arr.add(out1);
        arr.add(out2);
        arr.add(out3);
        */
        ArrayList<AutoCloseable> arr = new ArrayList<>();
        arr.add(out4);
        arr.add(out5);
        arr.add(out6);
        closeAll(arr);
    }

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elem) throws Exception{
        for(T e: elem){
            e.close();
        }
    }
}
