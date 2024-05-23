public class Media {
    public static void main(String[] args) throws Exception {
        double a = 10.0;
        double b = 15.0;

        System.out.println("Media = "+media(a,b));
    }

    public static double media(double x, double y){
        double m = (x+y)/2.0;
        return m;
    }
}
