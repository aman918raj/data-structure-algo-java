package sort;

import java.util.Scanner;

public class InsertionSort {

     void insertionSort(int[] array) {
        int size = array.length;

        //Write your code here
        for(int i = 1; i < size; i++){
            int key = array[i];
            int j = i - 1;
            while (j >=0 && array[j] > key){
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String args[] ) {
         InsertionSort is = new InsertionSort();
         Scanner scanner = new Scanner(System.in);
         int size = scanner.nextInt();
         int array[] = new int[size];
         for (int i = 0; i < size; i++) {
             array[i] = scanner.nextInt();
         }
         is.insertionSort(array);

         for(int i : array){
             System.out.print(i);
         }
    }
}
