package com.theironyard;


import java.util.Objects;

/**
 * This exercise is another collection of katas. Follow the instructions below
 * to create the specified methods.
 */
public class ArrayKatas {

    /**
     * Write a static method named sumArray() that accepts an array of doubles
     * and returns the sum of all of the numbers. The length of the array
     * received is arbitrary and unbounded. If there are zero numbers in the
     * array then return 0.
     * <p>
     * For this method you should use a for-each loop.
     *
     * @param numbers an array of doubles
     * @return the sum of the provided array of doubles
     */
    //get sum ->sum=
    // todo: create sumArray() method
    public static double sumArray(double[] numbers){
        double[] sumArray = new double[3];

        double sum = 0;

        for (double work : numbers) {

            sum = sum + work;
        }
        return sum;
    }

    /**
     * Create a static method named concatenateStrings() that accepts an array
     * of Strings and concentrates them together. The array of String objects is
     * is arbitrary and unbounded. If there are zero Strings in the array then
     * return an empty string.
     * <p>
     * For this method you should use a classic for loop (not for-each).
     *
     * @param strings an array of String
     * @return a concatenation of the provided array of strings.
     */
    // todo: create concatenateStrings() method


    //  String[] booksILike = new String[5];
    // booksILike[0] = "Harry Potter";
    // booksILike[1] = "East of Eden";
    // booksILike[2] = "One Fish Two Fish"

    // System.out.println(concatenateStrings(booksILike));
    //"Harry PotterEast of EdenOne Fish Two Fish"

    // String[] foodsILike = new String[2];
    // foodsIlike[0] = "Tacos";

    //System.out.println(concatenateStrings(foodsIlike))
    // "TacoFrenchFries"
    public static String concatenateStrings(String[] strings) {
        String newString = "";

        for (int x = 0; x < strings.length; x++) {
        //string[x] = cat
            newString = newString + strings[x];


        }

        return newString;
    }


    /**
     * Create a static method named reverseArray that accepts an array of
     * Objects. The method should return a new array in the reverse order. For
     * example:
     * <p>
     * input:
     * <p>
     * ["This", true, 1, 5.6]
     * <p>
     * reversed:
     * <p>
     * [5.6, 1, true, "This"]
     * //go back to "for loops"
     * Because the input and result can contain any type of data, make sure your
     * arguments and return data types are an array of the Object class.
     *
     * @param objects an array of arbitrary objects
     * @return an array of objects in reverse order
     */
    // todo: create reverseArray() method

    //int[] testArray = {1,2,3,4}
    //reverseArray(testArray)
    public static Object[] reverseArray(Object[] objects) {

        Object[] turd = new Object[objects.length];
        //new array , named "turd" new Objects[4]
        // turd = [0, 0, 0, 0]

        int y = objects.length - 1;
        //y = 0
        for (int x = 0; x < objects.length; x++) {
            turd[x] = objects[y];
            y--;
            //turd[3] = objects[0]
            //turd[3] = 1
        }
        //turd = {4, 3, 2, 1}

        return turd;
    }
}
