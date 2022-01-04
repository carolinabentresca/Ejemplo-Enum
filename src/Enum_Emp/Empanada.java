package Enum_Emp;

public enum Empanada {
    SALTA("Salteña"),
    TUCUMAN("Tucumana"),
    JUJUY("Jujeña");

    private final String TipoEmpanada;

    private Empanada(String TipoEmpanada) {
        this.TipoEmpanada = TipoEmpanada;
    }

    @Override
    public String toString() {
        return "TIPO DE EMPANADA: " + TipoEmpanada + "\n";
    }

}
