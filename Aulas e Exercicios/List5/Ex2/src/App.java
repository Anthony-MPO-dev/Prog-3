public class App {
    public static void main(String[] args) throws Exception {
        Pair Nums = new Pair<Integer>(1, 2);

        Pair real = new Pair<Double>(4.1, 7.8);

        System.out.println("1º elemento: "+Nums.getFirst());

        System.out.println("2º elemento: "+Nums.getSecond());

        System.out.println("Max: "+Nums.Max()+"\nMin: "+Nums.Min());

        System.out.println("Max: "+real.Max()+"\nMin: "+real.Min());
    }
}
