public enum DiaSemana{
    SEGUNDA("SEG"), TERÇA("TER"), QUARTA("QUA"), QUINTA("QUI"), SEXTA("SEX"), SABADO("SAB"), DOMINGO("DOM");

    //variavel de instancia
    private String abreviacao;

    //Contrutor
    DiaSemana(String abreviacao){
        this.abreviacao = abreviacao;
    }

    //getter abreviacao
    public String getAbreviacao() {
        return abreviacao;
    }

}