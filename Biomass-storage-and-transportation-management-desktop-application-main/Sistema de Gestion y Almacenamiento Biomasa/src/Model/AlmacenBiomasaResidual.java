package Model;

public class AlmacenBiomasaResidual extends Almacen implements ActividadBiomasa {

    public AlmacenBiomasaResidual(String tipo, int capacidad , int almaceneroId){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.almaceneroId = almaceneroId;
    }

    
    public void guardarBiomasa(Biomasa biomasa) {
        biomasaLista.add(biomasa);
    }

}
