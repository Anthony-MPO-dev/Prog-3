import java.util.Arrays;
import java.util.Comparator;

public class Funcionario implements Mensuravel {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    static double media(Mensuravel[] objs){
        double media =0;
        int contador=0;

        for(Mensuravel i: objs){
            //media += ((Funcionario)i).getSalario();
            media += i.getMedida();
            contador++;
        }
        media = media /contador;
        return media;
    }

    @Override

    public double getMedida(){    
        return getSalario();
    }


    public static Mensuravel maior(Mensuravel[] objs){
        Comparator<Mensuravel> x = (Mensuravel a, Mensuravel b) -> (int)b.getMedida() - (int)a.getMedida();
        Arrays.sort(objs, x);

        return objs[0];
    }
}
