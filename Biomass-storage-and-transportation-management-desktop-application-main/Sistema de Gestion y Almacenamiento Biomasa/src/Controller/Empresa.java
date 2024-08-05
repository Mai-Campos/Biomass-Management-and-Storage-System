package Controller;

import java.util.ArrayList;

import Excepcion.AlmacenNoEncontrado;
import Excepcion.EmpleadoNoEncontrado;
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

public Empleado buscarEmpleadoPorId(int id) {
    for (Empleado empleado : empleadosList) {
        if (empleado.getId() == id) {
            return empleado;
        }
    }
    throw new EmpleadoNoEncontrado("Empleado con Id: " + id + " no encontrado");
}

public Almacen buscarAlmacenPorNombre(String nombre) {
    for (Almacen almacen : almacenesList) {
        if (almacen.getNombre().equals(nombre)) {
            return almacen;
        }
    }
    throw new AlmacenNoEncontrado("El almacen " + nombre + " no existe");
}
}

