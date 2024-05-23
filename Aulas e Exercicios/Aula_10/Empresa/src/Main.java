import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>(List.of(new Funcionario("Linder", 1000), new Funcionario("Joãoo", 2000)));
        //processaFunc(lista);
        Predicate<Object> obj = e-> (e.toString().length() % 2) == 0; 
        //printAll(lista, (Funcionario f) -> f.getSalario() > 1000.0f);
        printAll(lista, obj);

        ArrayList<Gerente> lista2 = new ArrayList<>(List.of(new Gerente("Linder", 1000, "Composto"), new Gerente("Joãoo", 2000, "Composto")));
        processaFunc(lista2);

    }

    public static void printAll(ArrayList<Funcionario> staff, Predicate<? super Funcionario> teste){
        for(Funcionario f: staff){
            if(teste.test(f)){
                System.out.println("Nome: "+f.getNome()+" Salario: "+ f.getSalario());
            }
        }
    }


    public static void processaFunc(ArrayList<? extends Funcionario> staff){
        for(Funcionario f: staff){
            System.out.println(f.getNome());
        }
    }
}
