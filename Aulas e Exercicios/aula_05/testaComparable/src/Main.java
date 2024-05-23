import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        String[] array1 ={"Linder", "Candido", "Silva", "UFMT"};
        Pessoa[] pessoas = new Pessoa[4];

        pessoas[0] = new Pessoa("Linder C",  2);
        pessoas[1] = new Pessoa("Maria L",   5);
        pessoas[2] = new Pessoa("Anita do funk",   3);
        pessoas[3] = new Pessoa("Anthony M", 1);

        //A classe String implementa a interface Comparable<T>
        Arrays.sort(array1);// ordena as strings em ordem alfabetica
        Arrays.sort(pessoas);
        Arrays.sort(array1, new ComparaString()); // ordena agora pelo tamanho da String

        for(String s: array1){
            System.out.println(s);
        }

        for(Pessoa p: pessoas){
            System.out.println("Nome: "+p.getNome()+" Id: "+p.getId());
        }
    }
}
