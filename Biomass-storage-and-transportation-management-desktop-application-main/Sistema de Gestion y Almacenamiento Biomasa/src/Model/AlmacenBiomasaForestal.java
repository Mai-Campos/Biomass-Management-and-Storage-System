package Model;

import java.util.ArrayList;
import Excepcion.BiomasaNoEncontrada;

public class AlmacenBiomasaForestal extends Almacen implements ActividadBiomasa {

    ArrayList<Biomasa>biomasaForestalList=new ArrayList<>();

    public AlmacenBiomasaForestal(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public void guardarBiomasa(Biomasa biomasa) {
        if(capacidad >= biomasa.peso){
            biomasaForestalList.add(biomasa);
            capacidad -= biomasa.peso;
        }
    }
    public void retirarBiomasa(Biomasa biomasa){
        if(biomasaForestalList.contains(biomasa)){
            biomasaForestalList.remove(biomasa);
            capacidad += biomasa.peso;
        }
        else{
            throw new BiomasaNoEncontrada("El almacen no dispone de " + biomasa);
        }
    }
}
