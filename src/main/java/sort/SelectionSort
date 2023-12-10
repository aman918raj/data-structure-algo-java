package sort;

import java.util.Scanner;

public class SelectionSort {
    static int[] selectionSort(int[] array) {
        int size = array.length;

        //Write your code here
        for(int i = 0; i < size - 1; i++){
            int m = i;
            for(int j = i+1; j < size; j++){
                if(array[m] > array[j]){
                    m = j;
                }
            }
            int temp = array[i];
            array[i] = array[m];
            array[m] = temp;
        }
        return array;
    }

    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i : selectionSort(array)){
            System.out.print(i);
        }
    }
}
