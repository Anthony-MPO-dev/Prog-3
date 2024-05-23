public class ProfessorDE extends Professor{
    private float bonus;

      //construtor
    public ProfessorDE(String nome, int cpf, float salario, float bonus){
        super(nome,cpf,salario);//chama construtor da classe pai
        this.bonus = bonus;
    }

    //getters and setters
    public float getBonus(){return this.bonus;}
    public void setBonus(float bonus){this.bonus = bonus;}

    @Override
    public float getSalarioBase(){
        return super.getSalarioBase() + this.bonus;
    }
}
