package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class IntArrayTools {

    private int [] ArrayNumbers = new int[5];
    Scanner scanner = new Scanner(System.in);
    public int answer=-1;
    public boolean ascend;

    public void startProgram(){
        generateNumbers();
        isSortedAB(ArrayNumbers);
        question();
        isSorting(ArrayNumbers);
        printArray(ArrayNumbers);
        isSortedAB(ArrayNumbers);
    }

    private void generateNumbers(){
        Random generator = new Random();

        for (int i=0; i< ArrayNumbers.length; i++){
            ArrayNumbers[i] = generator.nextInt(10)+1;
        }
    }

    public void isSortedAB(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]<array[i+1]){
                ascend = true;
            }else{
                ascend = false;
            }

            System.out.println("Array Ascending?" + ascend);

        }
    }

    private void question(){


        printArray(ArrayNumbers);
        System.out.println("");
        System.out.println("How do you want to sort this array?");
        System.out.println("1. Ascending\t2. Descending");


        //valid input for question menu

        do{
            System.out.println("Enter answer:");
            answer = scanner.nextInt();
        }
        while (answer <= 0 || answer > 2);




    }

    private void isSorting(int[] array){
                        // Ascending array
        if (answer == 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int tempValue = array[i];
                        array[i] = array[j];
                        array[j] = tempValue;
                    }
                }
            }
        } else {         // Descending array
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] < array[j]) {
                        int tempValue = array[i];
                        array[i] = array[j];
                        array[j] = tempValue;
                    }
                }
            }
        }


    }

    private void printArray(int[] numbers){
        for (int number:numbers){
            System.out.print(number + " ");
        }
    }

}
