package Day4_JavaMethods;
import java.util.*;
public class WindChill {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = sc.nextDouble();
        
        double windChill = calculateWindChill(temp, windSpeed);
        System.out.printf("Wind chill temperature: %.2f°F%n", windChill);
    }
    
    public static double calculateWindChill(double t, double v) {
        return 35.74 + 0.6215*t - 35.75*Math.pow(v, 0.16) + 0.4275*t*Math.pow(v, 0.16);
    }
}
