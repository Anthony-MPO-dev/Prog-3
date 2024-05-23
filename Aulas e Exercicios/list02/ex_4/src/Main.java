public class Main {

//É possível implementar um método Java que troque o conteúdo de 
//duas variáveis int? E no caso de dois objetos Integer? Escreva
//um método para testar cada caso e explique os resultados.

//Resposta: Como é póssivel observar durante a execução, que nem os objetos Integer nem as variaveis
//int retornam os valores trocados para a variavel original apos a execução do metodo
//isso acontece pois durante a execução do metodo, são criados no caso das variaveis int
// outras duas variaveis int dentro do metodo que tem seus valores trocados, porem as
//variaveis trocadas detro do metodo são diferentes das variaveis que chamaram o metodo
//pois e como se tivesem sido feito copias das variaveis, e no caso do objeto Integer
//o certo seria ele mandar a referencia do objeto, mas como foi observado durante a execução acontece
//a mesma coisa do que acontece com variaveis int, ele cria dois objetos copias do objeto original e
//troca seus valores e não retorna para os objetos originais essa troca realizada 

    public static void Switch(int a, int b){
        int aux;
        aux = a;
        a = b;
        b = aux;
    }

    public static void SwitchInteger(Integer a, Integer b){
        Integer aux = a.intValue();
        a = b.intValue();
        b = aux.intValue();
        
    }

    public static void main(String[] args){
        int v1=2;
        int v2=6;
        //System.out.println("Valor de v1: "+v1+" valor de v2: "+v2+"\n");

        Integer n1 = 5;
        Integer n2 = 8;

        //System.out.println("Valor de n1: "+Integer.valueOf(n1)+" valor de n2: "+Integer.valueOf(n2)+"\n");

        //troca valores de v1 e v2
        Switch(v1, v2);

        //troca valores dos objetos n1 e n2
        SwitchInteger(n1, n2);

        System.out.println("Valor de v1: "+v1+" valor de v2: "+v2+"\n");
        System.out.println("Valor de n1: "+Integer.valueOf(n1)+" valor de n2: "+Integer.valueOf(n2)+"\n");
    
    
    }

}

