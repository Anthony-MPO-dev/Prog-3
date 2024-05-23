public class Main {

    //Complemente a implementação da classe RedeSocial apresentada durante as aulas. 
    //Adicione um método à inner class Membro para possibilitar a inserção de um membro 
    //na lista de amigos baseado no nome. Para simplificar, considere que na rede social
    //não existam duas pessoas com o mesmo nome.

    //classe para verificar e adicionar amigos existentes na redeSocial
    public static void adicionar(RedeSocial.Membro m, String nome){
        if(m.addAmigo(nome)){
            System.out.println("\nAmigo "+nome+" adicionado com sucesso a conta do usuario "+m.getNome()+"\n");
        }else{
            System.out.println("\n"+nome+" não existe ou não pode ser adicionado\n");
        }
    }
    public static void main(String[] args){
        RedeSocial novoInsta = new RedeSocial();

        RedeSocial.Membro m1 = novoInsta.addMembro("Anthony", 1);
        RedeSocial.Membro m2 = novoInsta.addMembro("Vinicius", 2);
        RedeSocial.Membro m3 = novoInsta.addMembro("Pedro", 3);
        RedeSocial.Membro m4 = novoInsta.addMembro("Gabriel", 4);
        //novoInsta.addMembro(novoInsta.new Membro("Linder", 5));

        System.out.println("\n------------Antes da remoção------------");
        //adiciona 2 amigos ao m1
        adicionar(m1, "Vinicius");    
        adicionar(m1,"Gabriel");
        //mostra membros
        novoInsta.showMembros();
        

        m2.desativar();
        m4.desativar();

        System.out.println("\n------------Depois da remoção--------------- \n");
        novoInsta.showMembros();

        System.out.println("\n-------Depois da adição de mais um amigo ao m1-------\n");
        adicionar(m1, "Pedro");
        //Tentativa de adicionar usuario 'Carlos' que não existe como amigo
        adicionar(m2, "Carlos");    
        novoInsta.showMembros();


    }
}
