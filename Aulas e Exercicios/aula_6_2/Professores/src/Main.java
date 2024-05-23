public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Linder", 12345, 1000.0f);
        ProfessorHorista p2 = new ProfessorHorista("Barbosa", 55555, 50.f, 40);
        ProfessorDE p3 = new ProfessorDE("Livia", 55455, 2000.f, 500.f);
        System.out.println("Nome: "+p1.getNome()+" CPF: "+p1.getCpf()+" Salario: "+p1.getSalarioBase());
        System.out.println("Nome: "+p2.getNome()+" CPF: "+p2.getCpf()+" Salario: "+p2.getSalarioBase());
        System.out.println("Nome: "+p3.getNome()+" CPF: "+p3.getCpf()+" Salario: "+p3.getSalarioBase());

        Professor p4 = new ProfessorHorista("Paulo", 12345, 50.f, 40);
        Professor p5 = new ProfessorDE("Max", 12345, 5000.f, 500.f);

        System.out.println("Nome: "+p5.getNome()+" CPF: "+p5.getCpf()+" Salario: "+p5.getSalarioBase()+" Bonus: "+((ProfessorDE)p5).getBonus());
        
        if(p5 instanceof ProfessorDE)
            System.out.println("A referencia p5 esta apontando para um ProfessorDE");
        ProfessorDE p7 = ()
    }
}
