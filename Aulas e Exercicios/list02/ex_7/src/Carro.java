//Implemente a classe Carro que modela um carro viajando
    //em linha reta, consumindo gasolina à medida que se move.
    //Forneça um método que modele a movimentação do carro por 
    //um determinado número de quilómetros, um método para 
    //adicionar um determinado número de litros ao tanque de
    //gasolina, um método para obter a distância corrente da
    //origem e um método para obter o nível de combustível.
    //Especifique a eficiência de combustível (em quilómetros/litro)
    //no construtor. A classe Carro deve ser uma classe imutável?
    //Por que ou Por que não? No programa principal, crie um carro,
    //abasteça, e o faça andar por 50 km. Imprima as informações relacionadas 
    //ao combustível a cada 10 km.
public class Carro{
        private double tanque;
        private double KmRodados;
        private double kmLitros;
        private int contador=0;
        private int contador2=0;

        public Carro(){
            this.kmLitros = 5.0f;
            this.tanque = 0.0f;
        }

        public Carro(double kmLitros){
            this.kmLitros = kmLitros;
            this.tanque = 0.0f;
        }

        

    
    public double getTanque() {
            return tanque;
        }

        public void setTanque(double tanque) {
            this.tanque = tanque;
        }

        public double getKmRodados() {
            return KmRodados;
        }

    public void dirigir(double km){
        
        if(km > kmLitros*tanque){
            System.out.println("\nO carro não tem combustivel suficiente para percorrer essa distancia\n");
        }else{
            if (km > kmLitros){
                while (km > 0){
                    KmRodados += 1;
                    contador++; 
                    contador2++;
                    km--;
                    if(contador2 == kmLitros){
                        tanque -= 1;
                        contador2 = 0;
                        
                    }
                    if (KmRodados<10){
                        if(contador == 10){
                            contador = 0;
                            System.out.println("Combustivel atual: "+getTanque());
                        }
                    }else{
                        if(contador == 10){
                            contador = 0;
                            System.out.println("Combustivel atual: "+getTanque());
                        }
                    }
                    
                }
                System.out.println("\nO carro percorreu "+KmRodados+"km\n");
            }else{
                while (km > 0){
                    KmRodados += 1;
                    contador++; 
                    contador2++;
                    km--;
                    if(contador2 == kmLitros){
                        tanque -= 1;
                        contador2 = 0;
                    }
                    if (KmRodados<=10){
                        if(contador == 10){
                            contador = 0;
                            System.out.println("Combustivel atual: "+getTanque());
                        }
                    }else{
                        if(contador == 10){
                            contador = 0;
                            System.out.println("Combustivel atual: "+getTanque());
                        }
                    }
                }
                System.out.println("\nO carro ja percorreu "+KmRodados+"km\n");
            }
            
        }
    }
    public void abastecer(double gasolina){
        if (gasolina > 0){
            if (gasolina+tanque > 100){
                System.out.println("Ou o tanque esta cheio ou você esta tentando colocar muito combustivel\n");
                System.out.println("Nivel atual de combustivel: "+getTanque());
            }else{
                setTanque(getTanque()+gasolina);
            }
            
        }else{
            System.out.println("Informe um valor maior que 0 para abastecer o tanque");
        }
    }
}