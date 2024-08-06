package Model;

public class Almacenero extends Empleado{

    private Almacen almacenAsignado;

    public Almacenero(String nombre, int empleadoId, String tipoTrabajo) {
        super(nombre, empleadoId, tipoTrabajo);
    }
    public Almacen getAlmacenAsignado(){
        return almacenAsignado;
    }
    public void asignarAlmacen(Almacen almacen) {
        almacenAsignado = almacen;
    }
}
