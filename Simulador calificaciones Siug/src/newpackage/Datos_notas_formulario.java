
package newpackage;
import java.io.*;

public class Datos_notas_formulario implements Serializable {
    
    public String cedula;
    public String nombre;
    public boolean t_masculino;
    public boolean t_femenino;
    public String t_nivel;
    public double num1;
    public double exa1;
    public double num2;
    public double exa2;
    public double promge;
    public String t_estado;
    public double supletorio;
    
    public Datos_notas_formulario( String p_cedula, String p_nombre, boolean p_masculino, boolean p_femenino,
                                  String p_nivel, double p_num1, double p_exa1, double p_num2, double p_exa2, double p_promge,
                                  String p_estado, double p_supletorio)
    {
       cedula=p_cedula;
       nombre=p_nombre;
       t_masculino=p_masculino;
       t_femenino=p_femenino;
       t_nivel=p_nivel;
       num1=p_num1;
       exa1=p_exa1;
       num2=p_num2;
       exa2=p_exa2;
       promge=p_promge;
       t_estado=p_estado;
       supletorio=p_supletorio;
    }        
        
public static void main(String[] args) {
      
       Login frml= new Login();
       frml.show(true);
    }    

   
}
