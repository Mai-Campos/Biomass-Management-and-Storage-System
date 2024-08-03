package Model;

public class Camion extends Vehiculo{

    public Camion(String estado, Chofer chofer, String tipoBiomasaTransporte, float capacidadTransporte){
        
        this.estado = estado;
        this.chofer = chofer;
        this.tipoBiomasaTransporte = tipoBiomasaTransporte;
        this.capacidadTransporte = capacidadTransporte;
    }

}
