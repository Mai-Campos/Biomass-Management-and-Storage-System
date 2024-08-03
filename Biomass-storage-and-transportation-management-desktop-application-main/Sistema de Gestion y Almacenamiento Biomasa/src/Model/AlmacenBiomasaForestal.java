package Model;

public class AlmacenBiomasaForestal extends Almacen implements GuardarBiomasa {

    public AlmacenBiomasaForestal(String nombre, int capacidad , int empleadoId){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.empleadoId = empleadoId;
    }

  
    public Biomasa guardarBiomasa(Biomasa biomasa) {
        return biomasa;
    }

    
  

}
