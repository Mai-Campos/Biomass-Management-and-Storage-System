package Model;

public class Chofer extends Empleado{
    
    protected  Vehiculo vehiculoAsignado;

    public Chofer(String nombre, int id, String tipoTrabajo, Vehiculo vehiculoAsignado) {
        
        super(nombre, id, tipoTrabajo);
        this.vehiculoAsignado = vehiculoAsignado;
      
    }

}
