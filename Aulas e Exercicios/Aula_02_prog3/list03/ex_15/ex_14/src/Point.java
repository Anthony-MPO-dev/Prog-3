public class Point implements Cloneable {

    protected double x;
    protected double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Getters and Setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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

    public void showPoint(){
        System.out.println("Point: ("+getX()+","+getY()+")\n\n");
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Point aux = (Point) super.clone();
        aux = new Point(this.getX(), this.getY()); 
        return aux;
    }

}
