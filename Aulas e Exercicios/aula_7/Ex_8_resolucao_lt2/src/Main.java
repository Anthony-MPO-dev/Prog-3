import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.LocalDate.of;
import static java.lang.System.out;

public class Main {

	//Altere o programa de impressão de calendário que fizemos
	//em sala de aula para que comece a semana no domingo e
	//com as iniciais dos dias em inglês. Note que não basta
	//apenas alterar o cabeçalho.
    public static void main(String[] args) {
        //convertendo a entrada para inteiro
        int mes = Integer.parseInt(args[0]);
        int ano = Integer.parseInt(args[1]);

        //criando uma dataBase do ano e mes pedido
        //LocalDate dataBase = LocalDate.of(ano, mes, 1);
        LocalDate dataBase = of(ano, mes, 1);
        

        //imprime o cabecalho
        out.println(" Sun Mon Tue Wed Thu Fri Sat ");

        //imprime calendario

        //para descobrir em que dia da semana comeca o mes e preenchendo o vazio
        DayOfWeek diaSemana = dataBase.getDayOfWeek();
        
        for(int i=0; i<diaSemana.getValue(); i++){
            if (diaSemana.getValue() == 7){
            }           
            else
                out.print("    ");
        }
        //imprime os dias
        while(dataBase.getMonthValue() == mes){
            out.printf("%4d", dataBase.getDayOfMonth());
            if(dataBase.getDayOfWeek().getValue() == 6)
                out.println();         
            dataBase = dataBase.plusDays(1);
        }
        out.println("");

    }
}
