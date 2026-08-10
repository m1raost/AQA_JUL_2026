import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {

        // TODO: write cycle which will fill another array in reverse.

        Random random = new Random();

        int[] array1 = new int[5]; // create array with 5 slots
        // loop all elements from 0 to 4 // index 0-4 // length 5
        for(int index = 0; index < array1.length; index++){
            array1[index] = random.nextInt(30); // add random numbers to array
            System.out.println(array1[index]);
        }
        System.out.println("==================");

        int[] array2 = new int[array1.length]; // create second array same length as array1 (5)
        int count = 0; //set the counter
        // loop for each element from 4 to 0, backward loop
        for(int index = array1.length - 1; index >= 0; index--){
            array2[count] = array1[index]; // array2[0] = array1[4]
            count++; // move 1 forward
        }
        for(int index = 0; index < array2.length; index++){
            System.out.println(array2[index]);
        }
    }
}

