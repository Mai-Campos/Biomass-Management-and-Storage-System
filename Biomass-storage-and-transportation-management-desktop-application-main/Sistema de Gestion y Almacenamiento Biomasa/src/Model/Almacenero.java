package Model;

public class Almacenero extends Empleado{

    private ActividadBiomasa almacenAsignado;

    public Almacenero(String nombre, int empleadoId, String tipoTrabajo) {
        super(nombre, empleadoId, tipoTrabajo);
    }
    public ActividadBiomasa asignarAlmacen(String almacen,String nombreAlmacen,int capacidadAlmacen) {
        if (almacen.equalsIgnoreCase("Forestal")){
            return new AlmacenBiomasaForestal(nombreAlmacen,capacidadAlmacen, empleadoId);
        }
        if (almacen.equalsIgnoreCase("Residual")){
            return new AlmacenBiomasaResidual(nombreAlmacen,capacidadAlmacen, empleadoId);
        }
        return null;
    }
   

}
