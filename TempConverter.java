//C = 5/9 * (F - 32)

package tempconverter;

import java.util.*;
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a temperature (Fahrenheit): ");
    double f = scan.nextDouble();
    
    double c = (5.0/9.0)*(f-32.0);
    System.out.println("The temperature today was " + f + " degrees in Fahrenheit and " + c + " degrees in Celsius");
    }
    
}
