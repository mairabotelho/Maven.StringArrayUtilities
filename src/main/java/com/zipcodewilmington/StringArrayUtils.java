package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        return array[array.length - 1];
    }



    /**
     * @param array array of String objectsc
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == value){
                answer = true;
            }
        }

        return answer;
    }



    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        int x = array.length - 1;
        String arrayReverse[] = new String[array.length];

        for(int index = 0; index < arrayReverse.length; index++){
            arrayReverse[index] = array[x];

            x--;
        }

        return arrayReverse;
    }



    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        int x = array.length - 1;
        String arrayReverse[] = new String[array.length];

        for(int index = 0; index < arrayReverse.length; index++){
            arrayReverse[index] = array[x];

            x--;
        }

        return Arrays.equals(array, arrayReverse);
    }



    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String stringOfItems = "";
        boolean result = true;

        for (String item : array){

            stringOfItems = stringOfItems + item.toLowerCase();
        }

        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < stringOfItems.length(); i++) {

            if ('a' <= stringOfItems.charAt(i) && stringOfItems.charAt(i) <= 'z'){
                index = stringOfItems.charAt(i) - 'a';
            mark[index] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (mark[i] == false) {
                result = false;
            }
        }

        return result;
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for(int index = 0; index < array.length; index++){

            if(array[index].contains(value)){
                count++;
            }
        }

        return count;
    }



    /**
     * @param array array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        String newArray[] = new String[array.length -1];
        int num = 0;


        for(int index = 0; index < array.length; index++){

            if(array[index].contains(valueToRemove)) {
            //do nothing
            }else{
                newArray[num] = array[index];
                num++;
            }
        }

        return newArray;
    }



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> listArray = new ArrayList<String>();
        listArray.add(array[0]);

        for(int index = 1; index < array.length; index++) {
            if (array[index-1] == array[index]){
                //do nothing
            }else{
                listArray.add(array[index]);
            }
        }

        //List to Array
            String[] result = new String[listArray.size()];
            result = listArray.toArray(result);

        return result;
    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        List<String> newList = new ArrayList<String>();
        String pack = array[0];

        for(int index = 1; index < array.length; index++) {

            if (array[index-1] == array[index]){
                pack = pack + array[index];

            }else{

                newList.add(pack);
                pack = array[index];
            }

        }

        newList.add(pack);


        //List to Array
        String[] result = new String[newList.size()];
        result = newList.toArray(result);

        return result;
    }


}
