public class Item implements Cloneable{
    private float preco;
    private String descricao;
    private Data data;


    //Construtor
    public Item(float preco, String descricao, int dia, int mes, int ano){
        this.preco = preco;
        this.descricao = descricao;
        this.data =  new Data(dia, mes, ano);
    }


    //Getters and Setters
    public float getPreco() {return preco;}
    public void setPreco(float preco) {this.preco = preco;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public Data getData(){return data;}
    public void setData(int dia, int mes, int ano){this.data.setDia(dia); this.data.setMes(mes); this.data.setAno(ano);}


    @Override
    public String toString(){
        return this.getClass()+ "[ Descricao: "+this.descricao+ " | Preço: "+this.preco+" | Dia: "+getData().getDia()+" Mes: "+getData().getMes()+" Ano: "+getData().getAno()+"]";
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Item aux = (Item) super.clone();
        aux.data = new Data(this.data.getDia(), this.data.getMes(), this.data.getAno()); 
        return aux;
    }
    
}
