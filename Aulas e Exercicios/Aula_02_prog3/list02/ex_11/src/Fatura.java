import java.util.ArrayList;

public class Fatura{
    public static class Item{ // classe aninhada estática
        private String descricao;
        private int quantidade;
        private double precoUnitario;

        //contrutor
        public Item(String desc, int qtd, double preco){
            this.descricao = desc;
            this.quantidade = qtd;
            this.precoUnitario = preco;

        }

        //metodos
        double precoTotal(){ return this.quantidade * this.precoUnitario;}

        
        
        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        public void setPrecoUnitario(double precoUnitario) {
            this.precoUnitario = precoUnitario;
        }
        
        
    }//end class Item

    ArrayList<Item> itens = new ArrayList<>();

    //metodos
    public void addItem(Item novo){
        this.itens.add(novo);
    }

    public void showItens(){
        for(Item i: this.itens){
            System.out.println("Descricao: "+i.getDescricao()+"\nQuantidade: "+i.getQuantidade()+"\nPreço Total: "+i.precoTotal()+"\n");
        }
    }

}
