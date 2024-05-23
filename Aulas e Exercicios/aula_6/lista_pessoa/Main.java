import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //lista de pessoas 
        ArrayList<String> lista = new ArrayList<>();
        lista.add(new Pessoa("Linder", 25));
        lista.add(new Pessoa("Anthony", 20));
        lista.add(new Pessoa("Pedro", 22));
        lista.add(new Pessoa("Max", 37));
        lista.add(new Pessoa("Leticia", 36));

        //Abordagem 0
        /*
        for(Pessoa p: lista){
            if(p.getIdade() >= 18)
            p.printPessoa();
        }
        */
        
        printPessoas(lista, (Pessoa p) -> p.getIdade());

        }


    //abordage 1
    public static void printPessoas(ArrayList<Pessoa> lista, Predicate<Pessoa> t){
        for (Pessoa p: lista){
            if(t.test(p)){
                p.printPessoa();
            }
        }
    }      
}
