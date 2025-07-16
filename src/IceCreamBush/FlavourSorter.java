package IceCreamBush;

class Flavour {
    String name;
    int sales;

    public Flavour(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }
}

public class FlavourSorter {
    public static void bubbleSort(Flavour[] flavours) {
    	int n  = flavours.length;
    	
    	for(int i = 0; i < n - 1; i++) {
    		for(int j = 0; j < n - i - 1;j++) {
    			if(flavours[j].sales < flavours[ j + 1].sales) {
    				Flavour temp = flavours[j];
    				flavours[j] = flavours[j + 1];
    				flavours[j + 1] = temp;
    			}
    		}
    	}
    }
    
    
    

    public static void displayFlavours(Flavour[] flavours) {
        for (Flavour f : flavours) {
            System.out.println(f.name + " - Sold: " + f.sales + " times");
        }
    }

    public static void main(String[] args) {
        Flavour[] flavours = {
            new Flavour("Vanilla", 15),
            new Flavour("Chocolate", 25),
            new Flavour("Strawberry", 10),
            new Flavour("Mango", 20)
        };

        System.out.println("Before sorting:");
        displayFlavours(flavours);

        bubbleSort(flavours);

        System.out.println("\nAfter sorting by popularity:");
        displayFlavours(flavours);
    }
}