
public class PontoRotulado extends Point{
    String rotulo;

    public PontoRotulado(String rotulo, double x, double y){
        super(x, y);
        this.rotulo = rotulo;
        
    }

    public String getRotulo() {
        return rotulo;
    }

    @Override
    public void imprime() {
        System.out.println("(Rotulo: "+getRotulo()+" - "+getX()+", "+getY()+")");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Point aux = (Point) super.clone();
        aux = new PontoRotulado(this.getRotulo(),this.getX(), this.getY()); 
        return aux;
    }
}
