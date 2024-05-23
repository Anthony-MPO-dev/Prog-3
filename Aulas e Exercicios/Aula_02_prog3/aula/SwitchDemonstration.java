public class SwitchDemonstration {
    public static void main(String[]args){
        int mes = 0;
    
        while(mes <= 12){    
            switch (mes) {
                case 1: System.out.println("\tJaneiro"); break;
                case 2: System.out.println("\tFevereiro"); break;
                case 3: System.out.println("\tMarço"); break;
                case 4: System.out.println("\tAbril"); break;
                case 5: System.out.println("\tMaio"); break;
                case 6: System.out.println("\tJunho"); break;
                case 7: System.out.println("\tJulho"); break;
                case 8: System.out.println("\tAgosto"); break;
                case 9: System.out.println("\tSetembro"); break;
                case 10: System.out.println("\tOutubro"); break;
                case 11: System.out.println("\tNovembro"); break;
                case 12: System.out.println("\tDezembro"); break;

                default:
                System.out.println("Proximo:\n");
                    break;
            }

            mes += 1;
        }
    }
}