import java.time.DayOfWeek;
import java.time.LocalDate;

//Implemente a classe Calendário com método estático para imprimir
// o calendário de um dado ano e mês. Use importes estáticos para
// as classes System e LocalDate. Lembre-se imports estáticos permitem 
//usar métodos estáticos sem mencionar as classes.

public class Main {
    public static void main(String[] args) {
        //convertendo a entrada para inteiro 
        int mes = Integer.parseInt(args[0]);
        int ano = Integer.parseInt(args[1]);

        LocalDate dataBase = LocalDate.of(ano,mes,1);

        //Imprime cabeçalho
        System.out.println(" Seg Ter Qua Qui Sex Sab Dom");
    
        //impime o calendario
        DayOfWeek diaSemana = dataBase.getDayOfWeek();
        
        // Imprime a quantiade de espaços vazios de acordo
        // com o dia da semana que começa o mes ex: se for
        // quinta sera 5 ou seja quatro espaços vazios e 
        // começa com o primeiro dia do mês
        for(int i=1; i< diaSemana.getValue(); i++)
            System.out.print("    ");

        //enquanto estiver no mes desejado
        while(dataBase.getMonthValue() == mes){
            //imprime dia do mês
            System.out.printf("%4d",dataBase.getDayOfMonth());
            
            //se for domingo pula uma linha
            if(dataBase.getDayOfWeek().getValue() == 7)
                System.out.println();

            dataBase = dataBase.plusDays(1);
             
        }
        System.out.println();
        
    }
}