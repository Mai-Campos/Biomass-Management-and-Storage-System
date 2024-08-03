package Model;

public abstract class Almacen {
    
    protected String nombre;
    protected int capacidad;
    protected int empleadoId;

    public int getEmpleadoId() {
        return empleadoId;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
}
