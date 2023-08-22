package vistas;

import javax.swing.*;

import logica.Auto;
import logica.Concesionario;
import logica.Moto;
import logica.Vehicle;
/**
 * Clase Pane para crear la parte visual por medio de JOptionPane
 *
 * @author: Cristian Camilo Castaño
 * @version: 20/08/2023/A
 * @see <a href = "https://github.com/ccastanor" /> github.com/ccastanor – mis inicios en Git </a>
 */
public class Pane {
    Concesionario elPelos = new Concesionario();
    Icon icono = new ImageIcon(getClass().getResource("conc.png"));

    /**
     * Método para ejecutar el menú principal
     */
    public void Administrador() {
        //elPelos.InitialVehicles();
        String[] opciones = {"Agregar vehículo", "Buscar vehículo", "Listar vehículos"
                , "Vender vehículos", "Actualizar datos", "Ventas", "Eliminar vehiculo", "Salir"};

        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción: ",
                "Concesionario el Pelos - Página principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                icono, opciones, "Salir");


        switch (opcion) {
            case 0:
                AgregarVehiculoPane();
                break;
            case 1:
                BuscarVehiculoPane();
                break;
            case 2:
                ImprimirVehiculoPane();
                break;
            case 3:
                VenderVehiculoPane();
                break;
            case 4:
                ActualizarDatosVehiclePane();
                break;
            case 5:
                VentasPane();
                break;
            case 6:
                EliminarVehiculoPane();
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Gracias por usar la App, vuelva pronto",
                        "Concesionario el Pelos - Salir", JOptionPane.INFORMATION_MESSAGE, icono);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }


    }

    public void AgregarVehiculoPane() {
        String[] opcionesAgre = {"Agregar Automovil", "Agregar Camion", "Agregar Moto", "Atrás"};

        int opcionAgre = JOptionPane.showOptionDialog(null, "Agregar Vehiculo: ",
                "Concesionario el Pelos - Agregar vehiculos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opcionesAgre, "Atrás");

        switch (opcionAgre) {
            case 0:
                String placa = JOptionPane.showInputDialog("Ingrese la placa del Automovil");
                String marca = JOptionPane.showInputDialog("Ingrese la marca del Automovil");
                String referencia = JOptionPane.showInputDialog("Ingrese la referencia del Automovil");
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Automovil");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del Automovil"));
                int num_ruedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ruedas del Automovil"));
                int num_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas del Automovil"));
                //lista desplegable para seleccionar si o no
                boolean is_gasolina = JOptionPane.showConfirmDialog(null, "¿El Automovil es a gasolina?",
                        "Concesionario el Pelos - Agregar vehiculos", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    if (is_gasolina == true){
                        is_gasolina = true;
                    } else {
                        is_gasolina = false;
                    }

                elPelos.AgregarVehiculoAuto( placa,  marca,  referencia,  modelo, precio ,num_ruedas,  num_puertas, is_gasolina);

                JOptionPane.showMessageDialog(null, "Automovil agregado con éxito",
                        "Concesionario el Pelos - Agregar vehiculos", JOptionPane.INFORMATION_MESSAGE, icono);
                AgregarVehiculoPane();
                break;
            case 1:
                String placaC = JOptionPane.showInputDialog("Ingrese la placa del Camión");
                String marcaC = JOptionPane.showInputDialog("Ingrese la marca del Camión");
                String referenciaC = JOptionPane.showInputDialog("Ingrese la referencia del Camión");
                String modeloC = JOptionPane.showInputDialog("Ingrese el modelo del Camión");
                double precioC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del Camión"));
                int num_ruedasC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ruedas del Camión"));
                int cap_carga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga"));


                elPelos.AgregarVehiculoCamion( placaC,  marcaC,  referenciaC,  modeloC, precioC ,num_ruedasC, cap_carga);

                JOptionPane.showMessageDialog(null, "Camión agregado con éxito",
                        "Concesionario el Pelos - Agregar vehiculos", JOptionPane.INFORMATION_MESSAGE, icono);

                AgregarVehiculoPane();;

                break;
            case 2:
                String placaM = JOptionPane.showInputDialog("Ingrese la placa de la moto");
                String marcaM = JOptionPane.showInputDialog("Ingrese la marca de la moto");
                String referenciaM = JOptionPane.showInputDialog("Ingrese la referencia de la moto");
                String modeloM = JOptionPane.showInputDialog("Ingrese el modelo de la moto");
                double precioM = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la moto"));
                int num_ruedasM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ruedas de la moto"));
                int cilindraje= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje de la moto"));
                double tam_tanque = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño del tanque de la moto"));


                elPelos.AgregarVehiculoMoto( placaM,  marcaM,  referenciaM,  modeloM, precioM ,num_ruedasM, cilindraje, tam_tanque);

                JOptionPane.showMessageDialog(null, "Moto agregada con éxito",
                        "Concesionario el Pelos - Agregar vehiculos", JOptionPane.INFORMATION_MESSAGE, icono);

                AgregarVehiculoPane();;

                break;
            case 3:
                Administrador();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida",
                        "Concesionario el Pelos - Agregar vehiculos", JOptionPane.INFORMATION_MESSAGE, icono);
                break;
        }
    }

    public void BuscarVehiculoPane() {
        String[] opciones = {"Por placa", "Por marca", "Por referencia", "Por modelo","Por precio", "Atrás"};

        int opcion = JOptionPane.showOptionDialog(null, "Buscar Vehiculo: ",
                "Concesionario el Pelos - Búsqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opciones, "Atrás");

        switch (opcion) {
            case 0:
                String placaBus = JOptionPane.showInputDialog("Ingrese la placa del vehiculo a buscar");
                elPelos.buscarVehiculoPlaca(placaBus);
                BuscarVehiculoPane();
                break;
            case 1:
                String marcaBus = JOptionPane.showInputDialog("Ingrese la marca del vehiculo a buscar");
                elPelos.buscarVehiculoMarca(marcaBus);
                BuscarVehiculoPane();
                break;
            case 2:
                String referenciaBus = JOptionPane.showInputDialog("Ingrese la referencia del vehiculo a buscar");
                elPelos.buscarVehiculoReferencia(referenciaBus);
                BuscarVehiculoPane();
                break;
            case 3:
                String modeloBus = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo a buscar");
                elPelos.buscarVehiculoModelo(modeloBus);
                BuscarVehiculoPane();
                break;
            case 4:
                double precioBus = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del vehículo a buscar"));
                elPelos.buscarVehiculoPrecio(precioBus);
                BuscarVehiculoPane();
                break;
            case 5:
                Administrador();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida",
                        "Concesionario el Pelos - Búsqueda", JOptionPane.INFORMATION_MESSAGE, icono);
                break;
        }
    }

    public void ImprimirVehiculoPane() {
        String[] opciones = {"Stock", "Vendidos", "Atrás"};


        int opcion = JOptionPane.showOptionDialog(null, "Listar Vehiculos: ",
                "Concesionario el Pelos - Listar", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opciones, "Atrás");

        switch (opcion) {
            case 0:
                elPelos.ImprimirArray();
                ImprimirVehiculoPane();
                break;
            case 1:
                elPelos.ImprimirArrayVendidos();
                ImprimirVehiculoPane();
                break;
            case 2:
                Administrador();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public void VenderVehiculoPane() {
        String[] opciones = {"Placa", "Atrás"};

        int opcion = JOptionPane.showOptionDialog(null, "Vender Vehiculo: ",
                "Concesionario el Pelos - Venta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opciones, "Atrás");

        switch (opcion) {
            case 0:
                String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo a vender");
                elPelos.venderVehiculo(placa);
                VenderVehiculoPane();
                break;
            case 1:
                Administrador();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public void ActualizarDatosVehiclePane() {
        String[] opciones = {"Placa", "Atrás"};

        int opcion = JOptionPane.showOptionDialog(null, "Actualizar Vehiculo: ",
                "Concesionario el Pelos - Actualizar", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opciones, "Atrás");

        switch (opcion) {
            case 0:
                String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo a actualizar");
                String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo a actualizar");
                String referencia = JOptionPane.showInputDialog("Ingrese la referencia del vehiculo a actualizar");
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo a actualizar");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del vehiculo a " +
                        "actualizar"));
                int num_ruedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ruedas del vehiculo" +
                        " a actualizar"));
                int num_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas del " +
                        "vehiculo a actualizar"));
                boolean is_gasolina = JOptionPane.showConfirmDialog(null, "¿El vehiculo es " +
                                "a gasolina?",
                        "Concesionario el Pelos - Actualizar vehiculos", JOptionPane.YES_NO_OPTION) ==
                        JOptionPane.YES_OPTION;
                if (is_gasolina == true){
                    is_gasolina = true;
                } else {
                    is_gasolina = false;
                }
                int cilindraje= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje del vehiculo a actualizar"));
                double tam_tanque = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño del tanque del vehiculo a actualizar"));
                double capacidad_carga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehiculo a actualizar"));

                elPelos.actualizarVehiculo(placa, marca, referencia, modelo, precio, num_ruedas, num_puertas,
                        is_gasolina, cilindraje, tam_tanque, capacidad_carga);
                ActualizarDatosVehiclePane();
                break;
            case 1:
                Administrador();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public void VentasPane() {
        String[] opciones = {"Por placa", "Por marca", "Por referencia", "Por modelo", "Atrás"};

        int opcion = JOptionPane.showOptionDialog(null, "Ventas: ",
                "Concesionario el Pelos - Ventas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opciones, "Atrás");

        switch (opcion) {
            case 0:
                //Buscar por placa
                break;
            case 1:
                //Buscar por marca
                break;
            case 2:
                //Buscar por referencia
                break;
            case 3:
                //Buscar por modelo
                break;
            case 4:
                Administrador();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public void EliminarVehiculoPane() {
        String[] opciones = {"Placa", "Atrás"};

        int opcion = JOptionPane.showOptionDialog(null, "Eliminar Vehiculo: ",
                "Concesionario el Pelos - Eliminar", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opciones, "Atrás");

        switch (opcion) {
            case 0:
                String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo a eliminar");
                elPelos.eliminarVehiculo(placa);
                EliminarVehiculoPane();
                break;
            case 1:
                Administrador();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }

}


