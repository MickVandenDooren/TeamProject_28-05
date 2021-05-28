package be.intecbrussel;
import java.util.*;

public class Lotto {


    int[] lotto = new int[6];
    Random rand = new Random();
    boolean x = true;
    int reserveNummer;

    public void play() {
        generate();
        sort();
        checkForDoubles();
        sort();
        generateReserveNummer(lotto);

        printArray(lotto);

        toString(reserveNummer);
    }


    public void generate() {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = rand.nextInt(44) + 1;
        }
    }


    private void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }


    private void sort() {
        for (int i = 0; i < lotto.length; i++) {
            for (int j = i + 1; j < lotto.length; j++) {
                if (lotto[i] > lotto[j]) {
                    int tempValue = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = tempValue;
                }
            }
        }
    }


    private void checkForDoubles() {
        for (int i = 0; i < lotto.length; i++) {
            for (int j = i + 1; j < lotto.length; j++) {
                if (lotto[i] == lotto[j]) {
                    lotto[i] = rand.nextInt(44) + 1;
                } else {
                    x = false;
                }
            }
        }
    }

    private void generateReserveNummer(int[] z) {
        Random generator2 = new Random();
        reserveNummer = generator2.nextInt(44) + 1; // maak reservenummer

        for (int k = 0; k > z.length; k++) {     //doorloop ingegeven array of reservenummer er in zit
            do {
                reserveNummer = generator2.nextInt(44) + 1;
            } while (reserveNummer == z[k]);
        }


    }


    private String toString(int x) {
        System.out.println("\n******************");
        System.out.println("Reservegetal: " + x);
        return "";
    }


}