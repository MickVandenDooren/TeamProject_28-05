package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class IntArrayTools {

    private int [] ArrayNumbers = new int[5];
    Scanner scanner = new Scanner(System.in);
    public int answer=-1;
    public boolean ascend;
    public int counter = 0;
    public boolean descend;
    public int searchNumber;
    public boolean checkNumber;

    public void startProgram(){
        generateNumbers();
        question();
        isSorting(ArrayNumbers);
        printArray(ArrayNumbers);
        isSorted(ArrayNumbers);
        chopSearch();
    }

    private void chopSearch(){



        System.out.println("Give a number you want to search for between 1-10: ");
        searchNumber = scanner.nextInt();
        for (int i = 0; i < ArrayNumbers.length; i++) {
            if (searchNumber == ArrayNumbers[i]) {
                counter++;
            }
            if (counter > 0) {
                checkNumber = true;
            } else {
                checkNumber = false;
            }

        }
        System.out.println("Is your number in the array? " + checkNumber);
    }



    private void generateNumbers(){
        Random generator = new Random();

        for (int i=0; i< ArrayNumbers.length; i++){
            ArrayNumbers[i] = generator.nextInt(10)+1;
        }
    }

    public void isSorted(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)

                if (array[i]<array[j]){
                    counter++;
                }
        }
        if (counter > array.length -1){
            ascend = true;
        }else{
            ascend = false;
        }
        System.out.println("\nArray Ascending? " + ascend);
        counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)

                if (array[i]>array[j]){
                    counter++;
                }
        }
        if (counter > array.length -1){
            descend = true;
        }else{
            descend = false;
        }
        System.out.println("Array Descending? " + descend);
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