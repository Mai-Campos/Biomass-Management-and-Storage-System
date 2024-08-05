package Excepcion;

public class AlmacenNoEncontrado extends RuntimeException {
    public AlmacenNoEncontrado(String mensaje) {
        super(mensaje);
    }
}
