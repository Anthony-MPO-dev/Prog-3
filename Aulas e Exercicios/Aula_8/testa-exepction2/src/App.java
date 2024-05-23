public class App {
    public static void main(String[] args) {
        try{
            System.out.println(f1()); 
        }catch(IllegalArgumentException e){
            System.out.println("Erro tratado com sucesso"); 
            System.out.println(e.getMessage()); 
        } 
    }

    public static int f1() throws IllegalArgumentException{
        return randInt(10,100);
    }

    public static int randInt(int inf, int sup){
        if(inf >= sup)
            throw new IllegalArgumentException("inf maior que sup");
        
        return (int) (inf + Math.random() * (sup - inf)); 
     }
}
