package Model;

public class Chofer extends Empleado{
    
    protected  Vehiculo vehiculoAsignado;

    public Chofer(String nombre, int id, String tipoTrabajo, Vehiculo vehiculoAsignado) {
        
        super(nombre, id, tipoTrabajo);
        this.vehiculoAsignado = vehiculoAsignado;
      
    }

    public Vehiculo getVehiculoAsignado(){
        if (vehiculoAsignado != null) {
            return vehiculoAsignado;
        } else {
            throw new RuntimeException("No se ha asignado un vehículo a este chofer");
        }
    }

}
