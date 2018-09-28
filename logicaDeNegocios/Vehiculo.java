package logicaDeNegocios;
import java.util.*;
import java.text.*;


/**
 * Almacena los datos de un vehiculo.
 * @author Arturo
 * @version 1.0.
 */
public class Vehiculo
{
  private int placa;
  private Date anioFabricacion;
  private String color;
  private String marca;
  private int capacidad;
  private int kilometraje;
  private ArrayList<ServicioDeMantenimiento> serviciosDeMantenimiento;
  private static int numeroDeVin;//vehicule identification number
  private String sedeDePertenencia;
  private String estado;//Fuera de servicio, En mantenimiento, En servicio
  /**
   * Constructor de la clase Vehiculo
  */
  Vehiculo(int pPlaca, String pColor, String pMarca, int pCapacidad){
    setCapacidad(pCapacidad);
    setMarca(pMarca);
    setColor(pColor);
    setPlaca(pPlaca);
    numeroDeVin++;
    serviciosDeMantenimiento = new ArrayList<ServicioDeMantenimiento>();
  }
  public int getNumeroDeVin(){
    return numeroDeVin;
   }
  public void aumentarKilometraje(int kilometrajeRecorrido){
    kilometraje+=kilometrajeRecorrido;
  }
  public int getKilometraje(){
    return kilometraje;
  }
  public void setEstado(String pEstado){
    estado=pEstado;
  }
  public String getEstado(){
    return estado;
  }
  public void setSedeDePertenencia (String pSedeDePertenencia){
    sedeDePertenencia=pSedeDePertenencia;
  }
  public String getSedeDePertenencia(){
    return sedeDePertenencia;
  }
  public void setCapacidad(int pCapacidad){
    capacidad=pCapacidad;
  }
  public int  getCapacidad(){
    return capacidad;
  }
  public void setMarca(String pMarca){
    marca=pMarca;
  }
  public String getMarca(){
    return marca;
  }
  public void setColor(String pColor){
    color=pColor;
  }
  public String getColor(){
    return color;
  }
  public void setPlaca(int pPlaca){
    placa=pPlaca;
  }
  public int setPlaca(){
    return placa;
  }
}
