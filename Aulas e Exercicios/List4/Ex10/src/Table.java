import java.util.ArrayList;

public class Table<K,V>{
    private ArrayList<Entry>table = new ArrayList<>();

    public class Entry{
        private K key;
        private V value;
    
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    
        public K getKey() {
            return key;
        }
    
        public void setKey(K key) {
            this.key = key;
        }
    
        public V getValue() {
            return value;
        }
    
        public void setValue(V value) {
            this.value = value;
        }      
    
    }

    public Table(K key, V value){     
            this.table.add(new Entry(key, value)); 
    }

    public V getTValue(K key){
        for(int i=0; i<table.size(); i++){
            if(table.get(i).getKey() == key){
                return table.get(i).getValue();
            }
        }
        System.out.println("\nErro: Chave não encontrada");
        return null;
    }

    public void setTValue(K key, V value){
        for(int i=0; i<table.size(); i++){
            if(table.get(i).getKey() == key){
                
                table.get(i).setValue(value);
                System.out.println("Celula alterada: chave: "+table.get(i).getKey()+" valor: "+table.get(i).getValue());
                return;
            }
        }
        System.out.println("\nCelula adicionada chave: "+key+" valor: "+value);
        this.table.add(new Entry(key, value));
        
    }

    public void removeTValue(K key){
        for(int i=0; i<table.size(); i++){
            if(table.get(i).getKey() == key){
                System.out.println("\nCelula removida: chave: "+table.get(i).getKey()+" valor: "+table.get(i).getValue());
                table.remove(i);
                return;
            }
        }
        System.out.println("\nErro: Chave não encontrada, não foi possivel remover o valor da tabela");
    }

    public void ImprimeT(){
        System.out.println("\n\nImprimindo Tabela: \n");
        for(int i=0; i<table.size(); i++){    
            System.out.println("\nChave: "+table.get(i).getKey()+" valor: "+table.get(i).getValue());            
        }
        
    }

    



    
}
