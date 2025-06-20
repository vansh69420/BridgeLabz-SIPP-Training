package Day4_JavaMethods;
import java.util.*;
public class GeometryCalculator {
	public static void main(String[] args) {

        double x1 = 1, y1 = 2;
        double x2 = 4, y2 = 6;
        

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between (%.1f,%.1f) and (%.1f,%.1f): %.2f%n", 
                         x1, y1, x2, y2, distance);
        

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Line equation: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);
    }
    

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }
}
