import java.time.DayOfWeek;
import java.time.LocalDate;

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
        LocalDate dataBase = LocalDate.of(ano, mes, 1);
        

        //imprime o cabecalho
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");

        //imprime calendario

        //para descobrir em que dia da semana comeca o mes e preenchendo o vazio
        DayOfWeek diaSemana = dataBase.getDayOfWeek();
        
        for(int i=0; i<diaSemana.getValue(); i++){
            if (diaSemana.getValue() == 7){
            }           
            else
                System.out.print("    ");
        }
        //imprime os dias
        while(dataBase.getMonthValue() == mes){
            System.out.printf("%4d", dataBase.getDayOfMonth());
            if(dataBase.getDayOfWeek().getValue() == 6)
                System.out.println();         
            dataBase = dataBase.plusDays(1);
        }
        System.out.println("");

    }
}
