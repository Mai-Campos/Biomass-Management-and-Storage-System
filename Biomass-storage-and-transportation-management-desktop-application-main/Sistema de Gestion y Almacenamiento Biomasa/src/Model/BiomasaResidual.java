package Model;

public class BiomasaResidual extends Biomasa {

    protected String tipoResiduo;

    public String getTipoResiduo() {
        return tipoResiduo;
    }
    public BiomasaResidual(String tipoResiduo, String nombre, int peso){
        this.tipoResiduo = tipoResiduo;
        this.nombre = nombre;
        this.peso = peso;
    }
}
