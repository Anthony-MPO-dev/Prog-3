public class Line extends Shape{
    private Point from;
    private Point to;

    public Line(Point from, Point to){
        this.from = from;
        this.to = to;
    }

    //getters and setters

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    public void setFrom(Point from) {
        this.from = from;
    }

    public void setTo(Point to) {
        this.to = to;
    }

    // metodos 
    @Override
    public Point getCenter() {
        
        Point p_centro = new Point((to.getX() + from.getX())/2, (to.getY()+from.getY())/2);
        return p_centro;
    }

    

}