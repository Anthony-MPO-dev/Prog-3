import java.util.ArrayList;
import java.util.List;

//Repita o exercício 4 usando um ArrayList para armazenar a tabela.

public class Main {
    
    public static class Trimestre{
        private double Total;
        private double Media;

        //Contrutor padrão
        public Trimestre(){
       
        }

        //Contrutor com o parametro do Valor dos gastos do Semestre
        public Trimestre(double total){ 
            this.Total = total;
            this.Media = Total/3;
        }
        
        public double getTotal() {
            return Total;
        }
        public double getMedia() {
            return Media;
        }

        public void setTotal(double total) {
            this.Total = total;
            this.Media = Total/3;
        }
        
    }
        
    public static void main(String[] args) {

        Trimestre Trimestre1 = new Trimestre(49000);
        Trimestre Trimestre2 = new Trimestre();
        Trimestre2.setTotal(61500);
        Trimestre Trimestre3 = new Trimestre();
        Trimestre3.setTotal(55000);
        Trimestre Trimestre4 = new Trimestre();
        Trimestre4.setTotal(60500);

        ArrayList<Trimestre> Gastos = new ArrayList<>(List.of(Trimestre1,Trimestre2,Trimestre3,Trimestre4));
    

        for(int i=0; i < 4; i++){
            System.out.printf(i+1 +"º Trimestre: \n\tGastos Total R$ %.2f\n\tMedia de Gastos R$ %.2f\n", ((Gastos.get(i)).getTotal()), ((Gastos.get(i)).getMedia()));
        }
    }

}