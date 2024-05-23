public class B implements X{
    
    public void f2(){
        System.out.println("Metodo especifico de B");
    }   
    
    @Override
    public void imprime(){
        System.out.println("Implementação da interface em B");
    }
}