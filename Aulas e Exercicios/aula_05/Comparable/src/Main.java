import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] meuArray ={"UFMT CUA", "PROG3", "Anthony Muniz"};
        
        Arrays.sort(meuArray);
        for(String s: meuArray){
            System.out.println(s);
        }
        System.out.println("\n\n");
        /*
        Arrays.sort(meuArray, new CompStr());
        for(String s: meuArray){
            System.out.println(s);
        }*/
        Comparator<String> x = (String o1, String o2) -> o1.length() - o2.length();
        Arrays.sort(meuArray, x);
        for(String s: meuArray){
            System.out.println(s);
        }
    }
}
