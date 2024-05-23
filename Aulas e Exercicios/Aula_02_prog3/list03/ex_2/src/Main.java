public class Main {
    //Continuando o exercício anterior, forneça o método Mensuravel maior(Measuravel[] objs).
    //Use-o para encontrar o nome do empregado com o maior salário. Você precisou fazer algum
    //casting, onde, por que?.

    /*
    
    R: Sim foi necessario fazer um casting no momento de printar o funcionario com maior salario
    pois para converter o objeto que é retornado como resultado do metodo 'maior()' pois o mesmo
    retorna um objeto do tipo Mensuravel, então foi necessario fazer um casting para converter 
    o mesmo para um objeto do tipo Funcionario, para conseguir imprimir o metodo get nome do
    funcionario.

    */ 
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Anthony", 2500.0f);
        Funcionario f2 = new Funcionario("Otavio", 2300.0f);
        Funcionario f3 = new Funcionario("Lucas", 5000.0f);
        Funcionario f4 = new Funcionario("Tales", 13800.0f);
        Funcionario f5 = new Funcionario("Bernardo", 2000.0f);
        Funcionario f6 = new Funcionario("Alice", 11700.0f);
        
        Funcionario[] funcionarios = {f1,f2,f3,f4,f5,f6};

        System.out.println("\nO salario médio dos funcionarios é: "+Funcionario.media(funcionarios));

        //casting para impressao do nome do objeto retornado (Mensuravel obj) do metodo maior()
        System.out.println("O funcionario com maior salario é : "+(((Funcionario) (Funcionario.maior(funcionarios))).getNome()));
    }
}