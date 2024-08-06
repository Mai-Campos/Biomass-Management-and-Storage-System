package Model;


public class Almacenero extends Empleado{

    protected Almacen almacenAsignado;

    public Almacenero(String nombre, int empleadoId, String tipoTrabajo) {
        super(nombre, empleadoId, tipoTrabajo);
    }
    public Almacen getAlmacenAsignado(){
        if (almacenAsignado != null) {
            return almacenAsignado;
        }else{
            throw new RuntimeException("No se ha asignado un almacen a este almacenero");
        }
    }
    public void asignarAlmacen(Almacen almacen) {
        if (almacenAsignado != null) {
            throw new RuntimeException("Ya se ha asignado un almacén a este almacenero");
        }
        almacenAsignado = almacen;
    }

    
}
