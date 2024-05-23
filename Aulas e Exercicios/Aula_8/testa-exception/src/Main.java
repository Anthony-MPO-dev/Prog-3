public class Main {
    public static void main(String[] args){
        System.out.println("Main: \n");
        try{
            f1();
        }catch(Exception e){
            System.out.println("Excecao tratada com sucesso");
        }
        System.out.println("\nFim do main");
    }

    public static int f1() throws Exception{
        System.out.println("Entro na função 1");
        f2();
        System.out.println("Fim da Função   1");
        return 1;
    }

    public static int f2() throws Exception{
        System.out.println("Entro na função 2");
        f3();      
        System.out.println("Fim da Função   2");
        return 2;
  
    }

    public static int f3() throws Exception{
        System.out.println("Entro na função 3");
        
        if(true){
            throw new RuntimeException();
        }else{
            System.out.println("Fim da Função   3");
        }
        return 3;
    }
}
