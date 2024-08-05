package Model;

public class Empleado {

    protected String nombre;
    protected int empleadoId;
    protected String tipoTrabajo;

    public Empleado(String nombre, int empleadoId, String tipoTrabajo){
        this.nombre = nombre;
        this.empleadoId = empleadoId;
        this.tipoTrabajo = tipoTrabajo;
    }
}
