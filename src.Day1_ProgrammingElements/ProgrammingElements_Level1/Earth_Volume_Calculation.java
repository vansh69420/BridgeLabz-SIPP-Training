package ProgrammingElements_Level1;

public class Earth_Volume_Calculation {
	public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm * 0.621371;
        double volumeKm = (4.0/3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0/3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        System.out.printf("The volume of earth in cubic kilometers is %.3e km³%n", volumeKm);
        System.out.printf("The volume of earth in cubic miles is %.3e mi³", volumeMiles);
    }
}
