public class Funcionario{
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

   

    public static void imprime(Funcionario[] funcs){
        int c = 0;
        for(Funcionario i: funcs){
            System.out.println("Funcionarios: \n Nome: "+(((Funcionario)(funcs[c])).getNome())+" Salario: "+(((Funcionario)(funcs[c])).getSalario())+"\n");
            c++;
        }
    }
}
