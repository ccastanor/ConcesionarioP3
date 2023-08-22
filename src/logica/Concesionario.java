package logica;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Clase Consecionario donde tendremos los metodos para agregar vehiculos, buscarlos, venderlos, etc.
 *
 * @author: Cristian Camilo Castaño
 * @version: 20/08/2023/A
 * @see <a href = "https://github.com/ccastanor" /> github.com/ccastanor – mis inicios en Git </a>
 */
public class Concesionario {

    //Creamos Arraylist para almacenar todos los vehiculos y los vendidos
    private ArrayList<Vehicle> vehiculos = new ArrayList<Vehicle>();
    private ArrayList<Vehicle> vehicles_sold = new ArrayList<Vehicle>();
    private Object Vehicle;

    /**
     * Funcion para agregar un vehiculo a un arraylist de vehiculos
     */

    public void AgregarVehiculoMoto(String placa, String marca, String referencia, String modelo,
                                    double precio, int num_ruedas, int cilindraje, double capacidad_tanque) {
        vehiculos.add(new Moto(placa, marca, referencia, modelo, precio, num_ruedas, cilindraje, capacidad_tanque));
    }

    public void AgregarVehiculoAuto(String placa, String marca, String referencia, String modelo,
                                    double precio, int num_ruedas, int num_puertas, boolean is_gasolina) {
        vehiculos.add(new Auto(placa, marca, referencia, modelo, precio, num_ruedas, num_puertas, is_gasolina));
    }

    public void AgregarVehiculoCamion(String placa, String marca, String referencia, String modelo,
                                      double precio, int num_ruedas, double capacidad_carga) {
        vehiculos.add(new Camion(placa, marca, referencia, modelo, precio, num_ruedas, capacidad_carga));
    }


    //Funcíon para imprimir el stock de vehiculos
    public void ImprimirArray() {

        if (vehiculos.size() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay vehiculos en inventario");
            //imprimir el arreglo con for


        } else {

            for (Vehicle vehiculo : vehiculos) {

                System.out.print(vehiculo.getPlaca() + " " + vehiculo.getMarca() + " "
                        + vehiculo.getReferencia() + " " + vehiculo.getModelo() + " "
                        + vehiculo.getPrecio() + " " + vehiculo.getNum_ruedas());
                if (vehiculo instanceof Auto) {
                    Auto auto = (Auto) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Auto
                    System.out.println("  "+auto.getNum_puertas() + " " + auto.getIs_gasolina());

                } else if (vehiculo instanceof Camion) {
                    Camion camion = (Camion) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Camion
                    System.out.println("  "+ camion.getCap_carga());
                } else if (vehiculo instanceof Moto) {
                    Moto moto = (Moto) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Moto
                    System.out.println("  "+moto.getCilindraje()+ " " + moto.getTam_tanque());


                }
            }


        }

       }
    //Funcion para imprimir los vehiculos vendidos
    public void ImprimirArrayVendidos() {

        if (vehicles_sold.size() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay vehiculos vendidos");
            //imprimir el arreglo con for

        } else {

            for (Vehicle vehiculo : vehicles_sold) {

                System.out.print(vehiculo.getPlaca() + " " + vehiculo.getMarca() + " "
                        + vehiculo.getReferencia() + " " + vehiculo.getModelo() + " "
                        + vehiculo.getPrecio() + " " + vehiculo.getNum_ruedas());
                if (vehiculo instanceof Auto) {
                    Auto auto = (Auto) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Auto
                    System.out.println("  " + auto.getNum_puertas() + " " + auto.getIs_gasolina());

                } else if (vehiculo instanceof Camion) {
                    Camion camion = (Camion) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Camion
                    System.out.println("  " + camion.getCap_carga());
                } else if (vehiculo instanceof Moto) {
                    Moto moto = (Moto) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Moto
                    System.out.println("  " + moto.getCilindraje() + " " + moto.getTam_tanque());

                }
            }
        }
    }
    //Funciona para buscar un vehiculo por placa
    public Vehicle buscarVehiculoPlaca(String placa) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                System.out.println(vehiculo.toString());
                return vehiculo;
            }
        }
        return null;
    }
    // funcion para buscar un vehiculo por marca
    public Vehicle buscarVehiculoMarca(String marca) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getMarca().equals(marca)) {
                System.out.println(vehiculo.toString());
                return vehiculo;
            }
        }
        return null;
    }
    // funcion para buscar un vehiculo por referencia
    public Vehicle buscarVehiculoReferencia(String referencia) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getReferencia().equals(referencia)) {
                System.out.println(vehiculo.toString());
                return vehiculo;
            }
        }
        return null;
    }
    //funcion para buscar un vehiculo por modelo
    public Vehicle buscarVehiculoModelo(String modelo) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getModelo().equals(modelo)) {
                System.out.println(vehiculo.toString());
                return vehiculo;
            }
        }
        return null;
    }
    //funcion para buscar un vehiculo por precio
    public Vehicle buscarVehiculoPrecio(double precio) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getPrecio() == precio) {
                System.out.println(vehiculo.toString());
                return vehiculo;
            }
        }
        return null;

    }
    //funcion para buscar un vehiculo por numero de ruedas
    public Vehicle eliminarVehiculo(String placa) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                vehiculos.remove(vehiculo);
                JOptionPane.showMessageDialog(null, "Vehiculo de placa: "+placa+" ha sido eliminado");
                return vehiculo;
            }
        }
        return null;
    }
    //funcion para vender un vehiculo
    public Vehicle venderVehiculo(String placa) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                vehicles_sold.add(vehiculo);
                vehiculos.remove(vehiculo);
                JOptionPane.showMessageDialog(null, "Vehiculo de placa: "+placa+" ha sido vendido");
                return vehiculo;
            }
        }
        return null;
    }
    //Función para actualizar los datos de un vehiculo, ya sea auto, moto o camion
    public Vehicle actualizarVehiculo(String placa, String marca, String referencia, String modelo,
                                      double precio, int num_ruedas, int num_puertas, boolean is_gasolina,
                                      int cilindraje, double capacidad_tanque, double capacidad_carga) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                vehiculo.setPlaca(placa);
                vehiculo.setMarca(marca);
                vehiculo.setReferencia(referencia);
                vehiculo.setModelo(modelo);
                vehiculo.setPrecio(precio);
                vehiculo.setNum_ruedas(num_ruedas);
                if (vehiculo instanceof Auto) {
                    Auto auto = (Auto) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Auto
                    auto.setNum_puertas(num_puertas);
                    auto.setIs_gasolina(is_gasolina);
                } else if (vehiculo instanceof Camion) {
                    Camion camion = (Camion) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Camion
                    camion.setCap_carga(capacidad_carga);
                } else if (vehiculo instanceof Moto) {
                    Moto moto = (Moto) vehiculo; // Hacemos un cast para acceder a los métodos específicos de Moto
                    moto.setCilindraje(cilindraje);
                    moto.setTam_tanque(capacidad_tanque);
                }
                JOptionPane.showMessageDialog(null, "Vehiculo de placa: "+placa+" ha sido actualizado");
                return vehiculo;
            }
        }
        return null;
    }
    //Funcion para ver las ventas totales de vehiculos
    public Vehicle ventasTotales() {
        double total = 0;
        for (Vehicle vehiculo : vehicles_sold) {
            total += vehiculo.getPrecio();
        }
        JOptionPane.showMessageDialog(null, "El total de ventas es: "+total);
        return null;
    }

}
