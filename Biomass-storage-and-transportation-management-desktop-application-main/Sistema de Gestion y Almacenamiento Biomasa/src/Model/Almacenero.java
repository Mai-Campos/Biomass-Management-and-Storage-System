package Model;

public class Almacenero extends Empleado{

    protected  Almacen almacenAsignado;

    public Almacenero(String nombre, int id, String tipoTrabajo, Almacen almacenAsignado) {
        super(nombre, id, tipoTrabajo);
        this.almacenAsignado = almacenAsignado;
       
    }
    
   

}
