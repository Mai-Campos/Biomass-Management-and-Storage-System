package Model;

import java.util.ArrayList;

public class AlmacenBiomasaForestal extends Almacen implements ActividadBiomasa {




    public AlmacenBiomasaForestal(String nombre, int capacidad , int empleadoId){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.almaceneroId = empleadoId;
    }

  
    public void guardarBiomasa(Biomasa biomasa) {
       biomasaLista.add(biomasa);
    }

    
  

}
