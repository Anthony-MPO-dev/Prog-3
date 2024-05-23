import java.util.Comparator;
public class ComparaString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2){
        int dif = o1.length() - o2.length();
        return dif;
    }
}
