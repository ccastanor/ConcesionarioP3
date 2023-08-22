package logica;
/**
 * Clase Moto hija de la clase Vehicle
 *
 * @author: Cristian Camilo Castaño
 * @version: 20/08/2023/A
 * @see <a href = "https://github.com/ccastanor" /> github.com/ccastanor – mis inicios en Git </a>
 */
public class Moto extends Vehicle {

    private int cilindraje;
    private double tam_tanque;

    public Moto() {

    }
    //Constructor objeto moto
    public Moto(String placa, String marca, String referencia, String modelo, double precio,
                int num_ruedas, int cilindraje, double tam_tanque) {
        super(placa, marca, referencia, modelo,precio, num_ruedas);
        this.cilindraje = cilindraje;
        this.tam_tanque = tam_tanque;
    }

    //Setters & Getters
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getTam_tanque() {
        return tam_tanque;
    }

    public void setTam_tanque(double tam_tanque) {
        this.tam_tanque = tam_tanque;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindraje=" + cilindraje +
                ", tam_tanque=" + tam_tanque +
                '}'+super.toString();
    }

    @Override
    public void queSoy() {
        // TODO Auto-generated method stub
        System.out.println("soy una moto");
    }

}
