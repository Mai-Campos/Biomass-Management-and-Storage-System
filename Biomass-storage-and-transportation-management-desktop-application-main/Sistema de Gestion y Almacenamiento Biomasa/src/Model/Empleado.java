package Model;

public class Empleado {

    protected String nombre;
    protected int id;
    protected String tipoTrabajo;

    public Empleado(String nombre, int id, String tipoTrabajo){
        this.nombre = nombre;
        this.id = id;
        this.tipoTrabajo = tipoTrabajo;
    }
}
