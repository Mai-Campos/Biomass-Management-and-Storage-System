package Model;

public class Tren extends Vehiculo {

    public Tren(String estado, Chofer chofer, String tipoBiomasaTransporte, float capacidadTransporte){
        
        this.estado = estado;
        this.chofer = chofer;
        this.tipoBiomasaTransporte = tipoBiomasaTransporte;
        this.capacidadTransporte = capacidadTransporte;
    }

}
