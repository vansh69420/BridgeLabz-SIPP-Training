package Day4_JavaMethods;

public class CollinearPointsChecker {
	public static void main(String[] args) {
        int x1 = 2, y1 = 4;  
        int x2 = 4, y2 = 6;  
        int x3 = 6, y3 = 8;  
        
                boolean collinearBySlope = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        
                System.out.println("Points A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");
        System.out.println("Collinear by slope method: " + collinearBySlope);
        System.out.println("Collinear by area method: " + collinearByArea);
    }

        public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
                int dxAB = x2 - x1;
        int dyAB = y2 - y1;
        int dxAC = x3 - x1;
        int dyAC = y3 - y1;
        
                if (dxAB == 0 && dxAC == 0) {
            return true; 
        } else if (dxAB == 0 || dxAC == 0) {
            return false; 
        }
        
        return (dyAB * dxAC) == (dyAC * dxAB);
    }

        public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
                int areaValue = Math.abs(
            x1 * (y2 - y3) + 
            x2 * (y3 - y1) + 
            x3 * (y1 - y2)
        );
        
        
        return areaValue == 0;
    }
}
