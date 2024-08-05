package Model;

public abstract class Vehiculo {

    protected String estado;
    protected Chofer chofer;
    protected String tipoBiomasaTransporte;
    protected float capacidadTransporte;

    public abstract String transportarBiomasa();
}
