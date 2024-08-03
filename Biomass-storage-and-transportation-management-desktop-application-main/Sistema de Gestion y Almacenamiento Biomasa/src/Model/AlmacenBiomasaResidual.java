package Model;

public class AlmacenBiomasaResidual extends Almacen implements GuardarBiomasa {

    public AlmacenBiomasaResidual(String nombre, int capacidad , int empleadoId){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.empleadoId = empleadoId;
    }

    
    public Biomasa guardarBiomasa(Biomasa biomasa) {
       return biomasa;
    }

}
