public class Circle extends Shape{

    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    

    public double getRadius() {
        return radius;
    }



    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Point aux = (Point) super.clone();
        Point aux2 = new Point(center.getX(),center.getY());
        aux = new Circle(aux2, this.getRadius()); 
        return aux;
    }   

    

   
    
}
