/**
 * Program to demonstrate the working of the ArrayList Class
 * 
 * @author Aadhitya Swarnesh
 */

import java.util.*;


class MyArrayList {
    
    /**
     * Main Function to create and handle an ArrayList
     * @param args
     */
    public static void main(String[] args) {
        
        // Form an object of the class
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // Add elements to the end of the list
        arr.add(12);
        arr.add(14);
        arr.add(2, 12);

        // This would cause an "IndexOutOfBoundsException" as there are only 3 elements until now
        //arr.add(4, 11);

        // Increase the capacity to x elements
        arr.ensureCapacity(20);

        // Create a shallow copy
        ArrayList arr2 = (ArrayList) arr.clone();


    }

}
