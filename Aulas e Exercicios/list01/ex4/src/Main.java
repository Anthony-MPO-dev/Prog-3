//Numa empresa existe uma tabela que armazena quanto foi gasto 
//em cada mês. Para fechar o balanço de cada trimestre, precisamos
//somar o gasto total. Sabendo que em Janeiro foram gastos 15000 
//reais, em Fevereiro 23000 reais, em Março 17000 reais, em Abril
// 17000 reais, em Maio 27000 reais, em Junho 17500 reais, em 
//Julho 19000, em Agosto 21000 reais, em Setembro 15000 reais, 
//em Outubro 21000, em Novembro 19000 reais e em Dezembro 20500 
//reais, faça um programa que calcule e imprima o gasto total e o
//gasto médio durante cada trimestre. Use um array para armazenar
// os valores da tabela.
public class Main {
 
    public static void main(String[] args) {

        float[] Trimestres = {49000,61500,55000,60500};
        float[] Gastos = new float[8];
        
       
        for (int i=0; i<8; i++){
            if (i < 4){
                 //faz o calculo da media de gastos Trimestrais
                Gastos[i] = Trimestres[i]/3;
            }
            else{
                Gastos[i] = Trimestres[i-4];
            }
        }

        for(int i=0; i < 4; i++){
            System.out.print(i+1 +"º Trimestre: \n\tGastos Total R$"+Gastos[i+4]+"\n\tMedia de Gastos R$"+Gastos[i]+"\n");
        }
    }

}