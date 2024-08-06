package Excepcion;

public class BiomasaNoEncontrada extends RuntimeException {
    public BiomasaNoEncontrada(String mensaje) {
        super(mensaje);
    }
}
