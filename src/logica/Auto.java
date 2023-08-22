package logica;
/**
 * Clase Auto hija de la clase Vehicle
 *
 * @author: Cristian Camilo Castaño
 * @version: 20/08/2023/A
 * @see <a href = "https://github.com/ccastanor" /> github.com/ccastanor – mis inicios en Git </a>
 */
public class Auto extends Vehicle {

    private int num_puertas;
    private boolean is_gasolina;
    //Constructor vacío
    public Auto() {

    }
    //Constructor de objeto auto
    public Auto(String placa, String marca, String referencia, String modelo, double precio, int num_ruedas,int num_puertas,
                boolean is_gasolina) {
        super(placa, marca, referencia, modelo, precio, num_ruedas);
        this.num_puertas = num_puertas;
        this.is_gasolina = is_gasolina;
    }

    //Setters & Getters
    public int getNum_puertas() {
        return num_puertas;
    }
    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;

    }

    public boolean getIs_gasolina() {
        return is_gasolina;
    }

    public void setIs_gasolina(boolean is_gasolina) {
        this.is_gasolina = is_gasolina;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "num_puertas=" + num_puertas +
                ", is_gasolina=" + is_gasolina +
                '}'+super.toString();
    }
    //Realizo prueba para probar git

    @Override
    public void queSoy() {
        // TODO Auto-generated method stub
        System.out.println("soy un carro");
    }



}