public class A implements X{

    public void f1(){
        System.out.println("Metodo especifico de A");
    }   
    
    @Override
    public void imprime(){
        System.out.println("Implementação da interface em A");
    }
}