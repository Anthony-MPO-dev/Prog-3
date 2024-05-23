public class Professor{
    private String nome;
    private int cpf;
    private float salarioBase;

    //connstrutor
    public Professor(String nome, int cpf, float salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salario;
    }

    //Getters and Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }    
}