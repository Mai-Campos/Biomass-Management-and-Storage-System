package Model;

public class BiomasaForestal extends Biomasa {

    protected String tipoMadera;
    
    public String getTipoMadera() {
        return tipoMadera;
    }
    public BiomasaForestal(String tipoMadera, String nombre, int peso){
        this.tipoMadera = tipoMadera;
        this.nombre = nombre;
        this.peso = peso;
    }
}
