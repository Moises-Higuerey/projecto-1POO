package logicaDeNegocios;
import javax.xml.bind.annotation.XmlType;



/**
 *Crea objetos para almacenar los datos de la direccion.
 *
 * @author Mariell, Moises, Jorge
 * @version 1.0
 * 
 */
@XmlType(propOrder={"provincia","canton","distrito","senias"})
public class Direccion{
  private String provincia;
  private String canton;
  private String distrito;
  private String senias;
  /**  
   * Constructor para objetos de clase Direccion;
  */
  public Direccion(String pProvincia, String pCanton, String pDistrito,
  String pSenias){    
  }
  public String getSenias(){
    return senias;
  }
  public void setSenias(String pSenias){
    senias=pSenias;
  }
  public String getDistrito(){
    return distrito;
  }
  public void setDistrito(String pDistrito){
    distrito=pDistrito;
  }
  public String getCanton(){
    return canton;
  }
  public void setCanton(String pCanton){
    canton=pCanton;
  }
  public String getProvincia(){
    return provincia;
  }
  public void setProvincia(String pProvincia){
    provincia=pProvincia;
  }
}
