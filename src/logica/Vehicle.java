package logica;
/**
 * Clase Vehicle Padre de las clases Auto, Moto y Camion
 *
 * @author: Cristian Camilo Castaño
 * @version: 20/08/2023/A
 * @see <a href = "https://github.com/ccastanor" /> github.com/ccastanor – mis inicios en Git </a>
 */
public abstract class Vehicle {
    //attributes vehicle class
    private String placa;
    private String marca;
    private String referencia;
    private String modelo;
    private double precio;
    private int num_ruedas;

//Constructor vacío
    public Vehicle() {}

// constructor vehiculo class
    public Vehicle(String placa, String marca, String referencia, String modelo,double precio, int num_ruedas) {
        super();
        this.placa = placa;
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.precio = precio;
        this.num_ruedas = num_ruedas;
    }

    //Setters & Getters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", referencia='" + referencia + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", num_ruedas=" + num_ruedas +
                '}';
    }

    // Abstract class
    public abstract void queSoy();

}