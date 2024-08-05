package Model;

public class BiomasaResidual extends Biomasa {

<<<<<<< HEAD
    protected String tipoResiduo;

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public BiomasaResidual(String tipoResiduo, String nombre, int peso){
        this.tipoResiduo = tipoResiduo;
        this.nombre = nombre;
=======
    public BiomasaResidual(String tipo, int peso){
        this.tipo = tipo;
>>>>>>> 66ffd536d4359e6e7df325b556fe516a69cd2a36
        this.peso = peso;
       
    }
}
