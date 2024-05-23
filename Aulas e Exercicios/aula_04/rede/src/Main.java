public class Main {
    public static void main(String[] args){
        RedeSocial novoInsta = new RedeSocial();

        RedeSocial.Membro m1 = novoInsta.addMembro("Anthony", 1);
        RedeSocial.Membro m2 = novoInsta.addMembro("Vinicius", 2);
        RedeSocial.Membro m3 = novoInsta.addMembro("Pedro", 3);
        RedeSocial.Membro m4 = novoInsta.addMembro("Gabriel", 4);
        //novoInsta.addMembro(novoInsta.new Membro("Linder", 5));

        System.out.println("Antes da remoção: \n");
        m1.addAmigo("Vinicius");
        m1.addAmigo("Gabriel");
        novoInsta.showMembros();
        

        m2.desativar();
        m4.desativar();

        System.out.println("\nDepois da remoção: \n");
        m1.addAmigo("Pedro");
        novoInsta.showMembros();


    }
}
