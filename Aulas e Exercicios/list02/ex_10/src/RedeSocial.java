import java.util.ArrayList;

public class RedeSocial{

    public class Membro{// Membro é uma inner class
        
        private String nome;
        private int id;
        ArrayList<Membro> amigos;

        //construtor
        public Membro(String nome, int id){
            this.nome = nome;
            this.id = id;
            amigos = new ArrayList<>();
        }

        //getters and setters
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

        //desativa um membro
        public void desativar(){
            //RedeSocial.this.membros.remove(this); // Em caso de conflito
            membros.remove(this);
        }

        //add novo membro amigo
        public boolean addAmigo(String nome){
            for(Membro m: membros){
                if (nome == m.nome){
                    amigos.add(m);
                    return true;
                }
            }
            return false;
        }

    }//end class Membro

    ArrayList<Membro> membros = new ArrayList<>();
    
    //metodos
    public Membro addMembro(String nome, int id){
        Membro m = new Membro(nome, id);
        membros.add(m);
        return m;
    }

    /*
    public void addMembro(Membro m){
        this.membros.add(m);
    }
    */
    public void showMembros(){
        for(Membro m: membros){
            System.out.println("Nome: "+m.getNome()+"\n ID: "+m.getId()+"\n");
            if(m.amigos.size() > 0){
                System.out.println("Amigos de "+m.nome+": \n");
                for(Membro a: m.amigos){
                    System.out.println("\tAmigo: "+a.getNome()+"\n");
                }
            }else{
                System.out.println("Usuario não tem amigos\n");
            }

        }
    }
}
