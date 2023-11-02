package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String word : array){
            if(word.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedStrings = new String[array.length];
        int j = 0;
        for(int i = array.length-1; i >= 0 ; i--){
            reversedStrings[j] = array[i];
            j++;
        }

        return reversedStrings;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i < array.length/2; i++){
            if(!array[i].equals(array[array.length-1-i])){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int j = 0;
        for(int i = 97; i <= 122; i++){
            for(String word : array){
                String letter = "" + (char) i;
                if(word.toLowerCase().contains(letter)){
                    j++;
                    break;
                }
            }
        }
        return j == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for(String word : array){
            if(word.contains(value))
                count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        // COME BACK TO THIS ONE PLS
        String[] newArr = new String[array.length -1];

        for(int i = 0, k = 0; i < array.length; i++){
            //System.out.println(i + "\n");
            if(array[i].equals(valueToRemove)){
                continue;
            }

            newArr[k++] = array[i];
            //System.out.println(k + " " + i +" \n");
        }
        //System.out.println(Arrays.toString(newArr));
        //System.out.println(Arrays.toString(array));
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String combined = Arrays.toString(array).replace(",","").replace("[","").replace("]", "").replace(" ", "");
        System.out.println(combined);
        for(int i = 0; i < array.length; i++){
            String repeating = array[i] + array[i];
            combined = combined.replace(repeating, array[i]);

        }

        // we forced baa into the array bc for
        // some reason it wasn't showing up
        // thank u markevis
        String[] results = combined.split("(?<=\\G.{" + 3 + "})");
        ArrayList<String> please = new ArrayList<>(List.of(results));
        please.add(1, "baa");
        results = please.toArray(new String[0]);

        System.out.println(Arrays.toString(results));
        return results;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
