package Excepcion;

public class EmpleadoNoEncontrado extends RuntimeException {
    public EmpleadoNoEncontrado(String mensaje) {
        super(mensaje);
    }
}
