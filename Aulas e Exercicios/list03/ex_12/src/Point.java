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

    @Override
    public String toString() {
        return "Point ["+this.x+", "+this.y+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        
        Point aux = (Point)obj;   
        return (this.x == aux.getX()) && (this.y == aux.getY());
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}