import java.util.Arrays;

public class Main {

    /*
    
	Faça uma chamada para Arrays.sort() para ordenar um
	array de objetos funcionários, tal como definidos
	no exercício um, com base no salário, em caso de 
	salários iguais a ordenação deve ser por nome, em 
	ordem alfabética.

    */ 
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Bernardo", 8500.0f);
        Funcionario f2 = new Funcionario("Otavio", 2300.0f);
        Funcionario f3 = new Funcionario("Lucas", 5000.0f);
        Funcionario f4 = new Funcionario("Tales", 13800.0f);
        Funcionario f5 = new Funcionario("Anthony", 8500.0f);
        Funcionario f6 = new Funcionario("Alice", 11700.0f);
        
        Funcionario[] funcionarios = {f1,f2,f3,f4,f5,f6};
        
        Arrays.sort(funcionarios, (Funcionario a, Funcionario b) -> {
            if(b.getSalario() < (int)a.getSalario()){
                return 1;
            }
            if(b.getSalario() == (int)a.getSalario()){
                return a.getNome().length() - b.getNome().length();
            }

            return -1;
        });
        
        Funcionario.imprime(funcionarios);
    }
}
