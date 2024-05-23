import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Funcionario> lista = new HashMap<>();
        Funcionario f1 = new Funcionario("Linder", 3000, 111);
        lista.put(f1.getRg(),f1);
        lista.put(222,new Funcionario("Anthony", 8000, 222));

        lista.forEach((u,v)->System.out.println(v.getNome()));

        //System.out.println(lista.get(222).getNome());

        for(Integer x: lista.keySet()){
            System.out.println(lista.get(x).getNome());
        }
        
    }
}
