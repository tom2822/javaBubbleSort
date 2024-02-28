import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5,2,9,1,5,6};

        System.out.println("Unsorted array: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){

        // Length of the array
        int len = array.length;

        for (int i = 0; i < len - 1; i++){
            for (int indx = 0; indx < len - i - 1; indx++){
                if (array[indx] > array[indx + 1]) {
                    int temp = array[indx];
                    array[indx] = array[indx + 1];
                    array[indx + 1] = temp;
                }
            }
        }

    }
}