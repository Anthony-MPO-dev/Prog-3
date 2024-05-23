public class Main {

    /*
        Defina uma classe abstrata chamada Shape com uma variável de instância 
        da classe Point (que modela um ponto tal como o do exercício 11), um construtor, 
        um método concreto público void moveBy(double dx, double dy) que move o ponto por 
        uma dada distância nas direções x e y, e um método abstrato público Point getCenter(). 
        Defina subclasses concretas Circle, Rectangle, Line com construtores public Circle(Point 
        center, double radius), public Rectangle(Point topLeft, double width, double height),
        e public Line(Point from, Point to). 
    */
    public static void main(String[] args) {
        Point p = new Point(4,6);

        p.showPoint();
        p = p.translate(2,2).scale(0.5);
        p.showPoint();

        Shape Circle = new Circle(p, 2);
        System.out.println("Circle: \n Centro: ("+Circle.getCenter().getX()+","+Circle.getCenter().getY()+")\n");
        Shape Rectangle = new Rectangle(p, 6, 4);
        System.out.println("Rectangle: \n Centro: ("+Rectangle.getCenter().getX()+","+Rectangle.getCenter().getY()+")\n");
        
        //novo ponto 
        Point p2 = new Point(2,3);

        Shape Line = new Line(p, p2);
        System.out.println("Line: \n Centro: ("+Line.getCenter().getX()+","+Line.getCenter().getY()+")\n");

    }
}
