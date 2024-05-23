public class Rectangle extends Shape{

    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        double x1;
        double y1;
        x1 = width/2; // centro em x
        y1 = height /2; // centro em y

        setX(topLeft.getX());
        setY(topLeft.getY());
        
        // adiciona em x e y  o quanto falta para chegar ao centro
        moveBy(x1, y1);

        // cria um Point auxiliar a ser retornado
        Point aux = new Point(getX(),getY());
        /*
        Point aux = new Point(topLeft.getX(), topLeft.getY());
        aux.setX(x1+aux.getX()); // adiciona em x quanto falta para chegar ao centro
        aux.setY(y1+aux.getY()); // adiciona em y o quanto falta para chegar ao centro
        */

        return aux;
    }

    

   
    
}
