package Model;

public class Almacen {
    
    protected String nombre;
    protected int capacidad;
    protected int empleadoId;

    public void setEmpleadoId(int empleadoId){
        this.empleadoId=empleadoId;
    }

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
