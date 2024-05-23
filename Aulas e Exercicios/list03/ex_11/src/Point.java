public class Point{
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
    

}