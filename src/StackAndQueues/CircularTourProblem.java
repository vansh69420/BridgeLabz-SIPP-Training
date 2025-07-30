package StackAndQueues;

public class CircularTourProblem {
    static class PetrolPump {
        int petrol, distance;
        PetrolPump(int p, int d) { petrol = p; distance = d; }
    }

    public static int findStart(PetrolPump[] pumps) {
        int n = pumps.length, start = 0, surplus = 0, deficit = 0;
        for (int i = 0; i < n; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {new PetrolPump(4,6), new PetrolPump(6,5), new PetrolPump(7,3), new PetrolPump(4,5)};
        System.out.println(findStart(pumps)); // Output: 1
    }
}
