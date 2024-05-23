public class Main {

/*
    Defina métodos clone para as classes dos exercícios 11 e 14.
*/

    public static void main(String[] args) throws CloneNotSupportedException{
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

        Shape Rectangle2 = (Rectangle) Rectangle.clone();
        Shape Circle2 = (Circle) Circle.clone();
        Shape Line2 = (Line) Line.clone();


        System.out.println("Os Retangulos são:");
        if(Rectangle.equals(Rectangle2)){ // se apontarem para o mesmo objeto
            System.out.println("São iguais\n");
        }else{
            System.out.println("São diferentes\n");
        }

        System.out.println("Os Circulos são:");
        if(Circle.equals(Circle2)){ // se apontarem para o mesmo objeto
            System.out.println("São iguais\n");
        }else{
            System.out.println("São diferentes\n");
        }

        System.out.println("As Linhas são:");
        if(Line.equals(Line2)){ // se apontarem para o mesmo objeto
            System.out.println("São iguais\n");
        }else{
            System.out.println("São diferentes\n");
        }
    
    
    }
}
