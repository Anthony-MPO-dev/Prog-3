public class Main {
    /*
    Crie uma interface chamada Mensuravel com um método double getMedida() para medir um objeto 
    de alguma forma. Crie a classe Funcionario com atributos nome e salário e a faça 
    implementar a interface Mensuravel. Finalmente, forneça o método double media(Measuravel[]
    objs) que calcula a média de objetos mensuráveis. No programa principal, use o método 
    média para calcular o salário médio de um array de funcionários.
    */ 
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Anthony", 2500.0f);
        Funcionario f2 = new Funcionario("Otavio", 2300.0f);
        Funcionario f3 = new Funcionario("Lucas", 5000.0f);
        Funcionario f4 = new Funcionario("Tales", 13800.0f);
        Funcionario f5 = new Funcionario("Bernardo", 2000.0f);
        Funcionario f6 = new Funcionario("Alice", 11700.0f);
        
        Funcionario[] funcionarios = {f1,f2,f3,f4,f5,f6};
	
	//imprime a media de salario dos funcionarios
        System.out.println("\nO salario médio dos funcionarios é: "+Funcionario.media(funcionarios));

    }
}
