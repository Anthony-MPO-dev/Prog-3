public class Item {
    private float preco;
    private String descricao;


    //Construtor
    public Item(float preco, String descricao){
        this.preco = preco;
        this.descricao = descricao;
    }


    //Getters and Setters
    public float getPreco() {return preco;}
    public void setPreco(float preco) {this.preco = preco;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}


    @Override
    public String toString(){
        return this.getClass()+ "[ Descricao: "+this.descricao+ " | Preço: "+this.preco+" ]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        
        Item aux = (Item)obj;   
        return (this.preco == aux.preco) && (this.descricao == aux.descricao);
    }
    
}
