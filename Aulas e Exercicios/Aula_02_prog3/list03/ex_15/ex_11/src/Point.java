public class Point implements Cloneable{
    protected double x;
    protected double y;
    
    //construtores
    public Point(){
        x=0;
        y=0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //getters 
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void imprime(){
        System.out.println("("+getX()+", "+getY()+")");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Point aux = (Point) super.clone();
        aux = new Point(this.getX(), this.getY()); 
        return aux;
    }
    

}