public class Gerente extends Funcionario {
    private String area;
    
    public Gerente(String nome, float salario,int rg, String area){
        super(nome, salario, rg);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString(){
        return super.toString() + "Area: "+ this.area;
    }
    
    
}
