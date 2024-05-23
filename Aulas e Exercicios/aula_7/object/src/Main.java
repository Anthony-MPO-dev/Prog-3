public class Main {
    public static void main(String[] args) {
        
        Item it0 = new Item(20.0f, "Arroz");
        Item it1 = new Item(20.0f, "Arroz");

        if(it1.equals(it0)){ // se apontarem para o mesmo objeto
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

        System.out.println("Item: "+it0); // Automaticamente chama o metodo toString()
    }
}
