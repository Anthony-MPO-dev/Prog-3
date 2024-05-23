import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Tamanho medida1 = Tamanho.MEDIO;
        Tamanho medida2 = Tamanho.GRANDE;
        System.out.println(medida2);

        Tamanho medida3 = Tamanho.valueOf("GRANDE");
        System.out.println(medida3);

        DiaSemana dia1 =DiaSemana.SEGUNDA;
        DiaSemana dia2 =DiaSemana.TERÇA;
        DiaSemana dia3 =DiaSemana.QUARTA;
        DiaSemana dia4 =DiaSemana.QUINTA;
        DiaSemana dia5 =DiaSemana.SEXTA;
        DiaSemana dia6 =DiaSemana.SABADO;
        DiaSemana dia7 =DiaSemana.DOMINGO;

    /*    
        DiaSemana[] lista = DiaSemana.values();

        for(DiaSemana d: lista){
            System.out.println(d);
            //Mostra o local onde d esta no array
            System.out.println(d.ordinal());
        }
    */

    DiaSemana [] dias = new DiaSemana[5];
    dias[0] = dia1;
    dias[1] = dia2;
    dias[2] = dia3;
    dias[3] = dia4;
    dias[4] = dia5;

    Arrays.sort(dias);
    System.out.println();

    for(DiaSemana d: dias){
        System.out.println(d.getAbreviacao());
    }

    

    }
    public enum Tamanho{PEQUENO, MEDIO, GRANDE}
    
}

