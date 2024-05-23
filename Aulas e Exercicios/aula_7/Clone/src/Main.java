
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Item it0 = new Item(20.0f, "Arroz", 15,1,2022);
        Item it1 = (Item) it0.clone();

        System.out.println("Objeto 1 "+it0);
        System.out.println("Objeto 1 "+it1);

        it1.setData(14,4,2010);

        if(it1.equals(it0)){ // se apontarem para o mesmo objeto
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

        System.out.println("Item: "+it0);
        System.out.println("Item: "+it1); // Automaticamente chama o metodo toString()
    }
}
