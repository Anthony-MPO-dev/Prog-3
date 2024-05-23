import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        //ArrayList<Funcionario> numeros = new ArrayList<>();
        //LinkedList<Funcionario> numeros = new LinkedList<>(); // -> list alocada dinamicamente
        //HashSet<Funcionario> numeros = new HashSet<>(); // com base em tabela hash
        TreeSet<Funcionario> numeros = new TreeSet<>(); // com base em arvores alocadas dinamicamente
        Funcionario f1 = new Funcionario("Linder", 3000);
        Funcionario f2 = new Funcionario("João", 4000);
        numeros.add(f1);
        numeros.add(f2);
        //numeros.add(new Funcionario("João", 4000));


        for(Funcionario f: numeros)
            System.out.println(f.getNome());

        numeros.forEach(e->System.out.println(e.getNome()));

        Iterator<Funcionario> it = numeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getNome());
        }
        
    }
}
