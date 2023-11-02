public class WorkingWithArrays {
    /**
     * Create arrays store values and navigate an array.
     * 
     * Arrays in java are static data structures. This means that once an array is created, you
     * cannot increase or decrease the size of the array. The size of the array is fixed.
     * 
     * To create an array we use the new keyword and sepceify the data type of the array and the
     * size. For example, to create an array of integers with a size of 10, we would use the
     * following syntax:
     * 
     * int[] myArray = new int[10];
     * 
     * Whenever an array is created, each element in the array is automatically initialized to the
     * default value for the data type.
     * 
     * For example, if we create an array of integers, each element in the array will be initialized
     * to 0.
     * 
     * If we create an array of booleans, each element in the array will be initialized to false.
     * 
     * If we create an array of strings, each element in the array will be initialized to null.
     * 
     * Arrays are zero indexed, which means that the first element in the array is at index 0. The
     * last element in the array is at index array.length - 1. To find the size of an array we use
     * the length property. For example, to find the size of the array above, we would use the
     * following syntax:
     * 
     * int size = myArray.length;
     */

public static void main(String[] args) {
    // Create an array of integers with a size of 5
    int[] numbers = new int[5];

    // Store values into the array
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    // numbers[4] = 5;

    // Print the values in the array
    System.out.println("The first element in the array is: " + numbers[0]);
    System.out.println("The second element in the array is: " + numbers[1]);
    System.out.println("The third element in the array is: " + numbers[2]);
    System.out.println("The fourth element in the array is: " + numbers[3]);
    System.out.println("The fifth element in the array is: " + numbers[4]);

    System.out.println();
    System.out.println("Print via loop");
    for (int index = 0; index < numbers.length; index++) {
        System.out.println("The element at index " + index + " is: " + numbers[index]);
    }

    // Create a String array with 5 elements
    String[] names = new String[5];

    System.out.println();
    System.out.println("String array");
    System.out.println("--------------------------------------------------");
    // Store values into the array
    names[0] = "John";
    names[1] = "Mary";
    names[2] = "Bob";
    names[3] = "Sue";

    // Print the values in the array
    System.out.println("The first element in the array is: " + names[0]);
    System.out.println("The second element in the array is: " + names[1]);
    System.out.println("The third element in the array is: " + names[2]);
    System.out.println("The fourth element in the array is: " + names[3]);
    System.out.println("The fifth element in the array is: " + names[4]);

    System.out.println();
    System.out.println("Print via loop");
    for (int index = 0; index < names.length; index++) {
        System.out.println("The element at index " + index + " is: " + names[index]);
    }

    System.out.println("Boolean array");
    System.out.println("--------------------------------------------------");

    // Create a boolean array with 3 elements
    boolean[] bools = new boolean[3];

    // Store values into the array

    // bools[0] = true;
    // bools[1] = false;
    // bools[2] = true;

    // Print the values in the array
    System.out.println("The first element in the array is: " + bools[0]);
    System.out.println("The second element in the array is: " + bools[1]);
    System.out.println("The third element in the array is: " + bools[2]);
}

}

