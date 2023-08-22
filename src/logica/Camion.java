package logica;
/**
 * Clase Camion hija de la clase Vehicle
 *
 * @author: Cristian Camilo Castaño
 * @version: 20/08/2023/A
 * @see <a href = "https://github.com/ccastanor" /> github.com/ccastanor – mis inicios en Git </a>
 */
public class Camion extends Vehicle{
     private double cap_carga;
    //Constructor vacío
     public Camion(){
     }
    //Constructor de objeto camión
    public Camion(String placa, String marca, String referencia, String modelo,double precio,
                  int num_ruedas, double cap_carga) {
        super(placa, marca, referencia, modelo, precio, num_ruedas);
        this.cap_carga = cap_carga;
    }
    //Setters & Getters
    public double getCap_carga() {
         return cap_carga;
    }

    public void setCap_carga(double cap_carga) {
         this.cap_carga = cap_carga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "cap_carga=" + cap_carga +
                '}'+super.toString();
    }

    @Override
    public void queSoy() {
        System.out.println("soy un camión");
    }
}
