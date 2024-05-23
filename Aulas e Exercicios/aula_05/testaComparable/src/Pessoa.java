public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int id;
    
    public Pessoa(String nome, int id){
        this.nome = nome;
        this.id = id;   
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Pessoa o){
        //ordena por id
       // int dif = this.id - o.id;
       // return dif;

       //ordena por ordem alfabetica
       //return this.nome.compareToIgnoreCase(o.nome);
       
        //ordena por tamanho da String 
       int dif = this.nome.length() - o.nome.length();
       return dif;
    }
}
