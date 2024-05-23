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
    public void translate(double xt, double yt){
        this.x = xt + x;
        this.y = yt + y;
  
    }

    public void scale(double s){  

        this.x = (x*s);
        this.y = (y*s);
    }

    public void imprime(){
        System.out.println("("+getX()+", "+getY()+")");
    }
  
    

}