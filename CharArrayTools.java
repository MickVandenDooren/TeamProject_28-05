package be.intecbrussel;
import java.util.Scanner;


public class CharArrayTools {
    public char[] letters = new char[5];
    Scanner scanner = new Scanner(System.in);
    public char fillerLetter;
    public int answer = -1;
    public int wordLength;
    public int [][] dictionary;
    public int counter;
    public char control;

    public void startProgram() {
        filterAlphabet();
        question();
        sort();
        generateDictionary();
    }
    private char[] filterAlphabet() {
        System.out.println("Give 5 lowercase characters.");
        for (int i = 0; i < letters.length; i++) {
            fillerLetter = scanner.next().charAt(0);
            if (fillerLetter > 96 && fillerLetter < 123) {
                letters[i] = fillerLetter;
                counter++;
            }
        }
        char[] uitkomst = new char[counter];


        for (int i = 0; i < uitkomst.length; i++) {

            for(int j = i; j < letters.length; j++) {

                control = letters[j];
                if (control > 96 && control < 123) {
                    uitkomst[i]=letters[j];
                }
            }

        }
        System.out.println(uitkomst);
        return uitkomst;
    }
    private void question() {
        System.out.println("");
        System.out.println("How do you want to sort theses numbers?");
        System.out.println("1. Alphabetically\t2. Reversed Alphabetically");

        //valid input for question menu
        do {
            System.out.println("Enter answer:");
            answer = scanner.nextInt();
        }
        while (answer <= 0 || answer > 2);
    }
    private char[] sort() {
        if (answer == 1) {
            for (int i = 0; i < letters.length; i++) {
                for (int j = i + 1; j < letters.length; j++) {
                    if (letters[i] > letters[j]) {
                        char tempValue = letters[i];
                        letters[i] = letters[j];
                        letters[j] = tempValue;
                    }
                }
            }
        } else {         // Descending array
            for (int i = 0; i < letters.length; i++) {
                for (int j = i + 1; j < letters.length; j++) {
                    if (letters[i] < letters[j]) {
                        char tempValue = letters[i];
                        letters[i] = letters[j];
                        letters[j] = tempValue;
                    }
                }
            }
        }
        System.out.println(letters);
        return letters;

    }
    private void generateDictionary() {
        System.out.println("Enter the amount of letters your words may contain:");
        wordLength = scanner.nextInt();
        dictionary = new int[wordLength][];
        for (int i = 0; i<dictionary.length;i++){

        }
        System.out.println(dictionary);
    }
}