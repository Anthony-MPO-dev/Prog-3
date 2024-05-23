public class MeuRecurso implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Fechou!!");
        
    }
    
}
