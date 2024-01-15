import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> speedsAll = new ArrayList<>();
        ArrayList<Integer> speedsInRange = new ArrayList<>();

        captureSpeeds(speedsAll);

        filterSpeeds(speedsAll, speedsInRange);
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println("Semua kecepatan:");
        System.out.println("-=-=-=-=-=-=-=-");
        displaySpeeds(speedsAll);
        System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Kecepatan antara 80 s/d 100 km/jam:");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        displaySpeedsInRange(speedsInRange);
        System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Kecepatan di bawah 80 km/jam:");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        displaySpeedsBelowThreshold(speedsAll);
    }

    // a) Kondisi While Loop
    private static void captureSpeeds(ArrayList<Integer> speedsAll) {
        Random random = new Random();
        int count = 0;

        while (count < 200) {
            int randomSpeed = random.nextInt(150); // Angka maksimum bisa disesuaikan
            speedsAll.add(randomSpeed);
            count++;
        }
    }

    // b) ArrayList untuk menyimpan kecepatan dalam rentang tertentu
    private static void filterSpeeds(ArrayList<Integer> speedsAll, ArrayList<Integer> speedsInRange) {
        for (int speed : speedsAll) {
            if (speed >= 80 && speed <= 100) {
                speedsInRange.add(speed);
            }
        }
    }

    // c) Method untuk menampilkan hasil
    private static void displaySpeeds(ArrayList<Integer> speeds) {
        for (int speed : speeds) {
            System.out.print(speed + " km/jam ");
        }
    }

    private static void displaySpeedsInRange(ArrayList<Integer> speeds) {
        for (int speed : speeds) {
            System.out.print(speed + " km/jam ");
        }
    }

    private static void displaySpeedsBelowThreshold(ArrayList<Integer> speeds) {
        for (int speed : speeds) {
            if (speed < 80) {
                System.out.print(speed + " km/jam ");
            }
        }
    }
}
