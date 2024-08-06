package Model;

import java.util.ArrayList;
import Excepcion.BiomasaNoEncontrada;

public class AlmacenBiomasaResidual extends Almacen implements ActividadBiomasa {

    ArrayList<Biomasa>biomasaResidualList=new ArrayList<>();
    
    public AlmacenBiomasaResidual(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public void guardarBiomasa(Biomasa biomasa) {
        if(capacidad >= biomasa.peso){
            biomasaResidualList.add(biomasa);
            capacidad -= biomasa.peso;
        }
    }
    public void retirarBiomasa(Biomasa biomasa){
        if(biomasaResidualList.contains(biomasa)){
            biomasaResidualList.remove(biomasa);
            capacidad += biomasa.peso;
        }
        else{
            throw new BiomasaNoEncontrada("El almacen no dispone de " + biomasa);
        }
    }
}
