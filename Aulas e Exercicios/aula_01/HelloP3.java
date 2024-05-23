public class HelloP3{
    public static void main(String[] args){
        
        int x = 200;
        long y = x;

        System.out.println("Hello World ;3\n"+Math.sin(2.11)+"\n"+"oi".equals("oi"));
        System.out.println(y);
        
        StringBuilder builder = new StringBuilder();
        builder.append("Linder");
        builder.append(" Candido");
        String nome = builder.toString();

        System.out.println(nome);
        
        String numero = Long.toString(y);
        System.out.println(numero);

        //converte string para int
        int j = Integer.parseInt(numero);
        System.out.println(j);

    }
}

