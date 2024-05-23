public class ProfessorHorista extends Professor{
    private int nhoras;

    public ProfessorHorista(String nome, int cpf, float horaBase, int nhoras){
        super(nome,cpf,horaBase);//chama construtor da classe pai
        this.nhoras = nhoras;
    }

    //getters and setters
    public void setNumeroHoras(int nhoras){this.nhoras = nhoras;}
    public int getNumeroHoras(){return nhoras;}

    //calculo do salario
    @Override
    public float getSalarioBase(){
        return super.getSalarioBase() * this.nhoras;
    }
}
