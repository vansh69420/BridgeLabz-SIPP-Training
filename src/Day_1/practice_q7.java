package Day_1;

public class practice_q7 {
	public static void main(String[] args) {
        double r = 6378;
        double pi = 3.14;
        double r_in_mile = 0.621371;
        final double PI = Math.PI;
        double volume_in_km = (4.0/3.0) * PI * Math.pow(r, 3);;
        double earthRadiusMiles = r * r_in_mile;
        double volumeMiles3 = (4.0/3.0) * PI * Math.pow(earthRadiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volume_in_km + " and cubic miles is " + volumeMiles3);
    }

}
