package Controller;

import java.util.ArrayList;

import Model.Almacen;
import Model.Empleado;
import Model.Vehiculo;

public class Empresa {

    protected ArrayList<Almacen> almacenesList;
    protected ArrayList<Empleado> empleadosList;
    protected ArrayList<Vehiculo> vehiculosList;

    public Empresa() {
        almacenesList = new ArrayList<>();
        empleadosList = new ArrayList<>();
        vehiculosList = new ArrayList<>();
    }

    
    public void agregarAlmacen(Almacen almacen) {
        almacenesList.add(almacen);
    }

    public void eliminarAlmacen(Almacen almacen) {
        almacenesList.remove(almacen);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleadosList.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleadosList.remove(empleado);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculosList.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculosList.remove(vehiculo);
    
    
}
}
