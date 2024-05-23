public final class Point{
    private double x;
    private double y;
    
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

    //metodos
    public Point translate(double xt, double yt){
        xt += x;
        yt += y;

        Point novo = new Point(xt, yt);
        return novo;
    }

    public Point scale(double s){  
        Point novo = new Point((x*s), (y*s));
        return novo;
    }

    public void imprime(){
        System.out.println("("+getX()+", "+getY()+")");
    }
  
    

}