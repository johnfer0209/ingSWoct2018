
package calcularedad;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author John Urbina
 */
public class CalcularEdad {

  
    public static void main(String[] args) throws FileNotFoundException {
        
       PrintStream file = new PrintStream("GuardarResultado.txt");
       try {
           //Declaración de Variables
            System.out.println("");
            Scanner sca = new Scanner(System.in);
            Calendar cal = new GregorianCalendar();
            int mesActual = cal.get(Calendar.MONTH), anyoActual = cal.get(Calendar.YEAR),
                    diaActual = cal.get(Calendar.DAY_OF_MONTH);
            int mes, dia, anyo;
            int mesResultado, diaResultado, anyResultado;

            //Solicitamos la información al Usuario
            System.out.println("Se procedera a calcular cuantos años tienes, Favor proporcionarnos la siguiente información");
            System.out.println("Cual es el dia de nacimiento expresado en números");
            dia = sca.nextInt();
            System.out.println("En que mes nació?");
            mes = sca.nextInt();
            System.out.println("En que año nació");
            anyo = sca.nextInt();

            //Creamos las excepciones
            if (dia < 0 | dia > 31) {
                throw new Exception("El día ingresado es incorrecto");

            }
            if (mes < 0 | mes > 12) {
                throw new Exception("El mes ingresado es incorrecto");

            }
            if (anyo < 0) {
                throw new Exception("El año ingresado es incorrecto");

            }

            mesResultado = Math.abs(mes - mesActual);
            diaResultado = diaActual;
            anyResultado = Math.abs(anyo - anyoActual);

            System.out.println("Tienes " + anyResultado + " años" + ", " + mesResultado
                    + " meses " + " y " + diaResultado + " días");
        } catch (Exception ex) {
            System.out.println("Ha habido un error en el cálculo realizado" + ex.toString());
        }
       
       
    }
    
}
