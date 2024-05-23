public abstract class Shape extends Point{

    public void moveBy(double dx, double dy){
        setX(getX()+dx);
        setY(getY()+dy);

    }

    public abstract Point getCenter();

}
