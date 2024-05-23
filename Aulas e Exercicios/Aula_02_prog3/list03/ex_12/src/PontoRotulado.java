
public class PontoRotulado extends Point {
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
    public String toString() {
        return "Point "+this.rotulo+" ["+this.x+", "+this.y+"]";
    }
}
