public class Main {
    public static void main(String[] args) {
        //TestaExecAdiada.repete(5, ()-> System.out.println("Prog 3!"));
        //TestaExecAdiada.repete(5, System.out::println);

        TestaExecAdiada.repete(5, (Integer i) -> System.out.println("Numero "+i));
        TestaExecAdiada.repete(20, System.out::println);
    }
}
