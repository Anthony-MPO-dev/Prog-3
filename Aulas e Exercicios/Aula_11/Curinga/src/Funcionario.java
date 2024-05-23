public class Funcionario implements Comparable<Funcionario>{
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    

    @Override
    public String toString(){
        return "Nome: "+this.nome+" Salario: "+this.salario;
    }

    @Override // obrigatorio para comparar os elementos na arvore binaria, para dizer como comparar dois funcionarios
    public int compareTo(Funcionario o) {
        if(this.salario > o.salario)
            return 1;
        else if(this.salario < o.salario)
            return -1;
        else return 0;
    }
}